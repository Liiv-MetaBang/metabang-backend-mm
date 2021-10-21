package com.dkne.metabang.service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dkne.metabang.domain.house.House;
import com.dkne.metabang.domain.house.HouseRepository;
import com.dkne.metabang.web.dto.HouseResponseDto;
import com.dkne.metabang.web.dto.HouseSaveRequestDto;
import com.dkne.metabang.web.dto.HouseUpdateRequestDto;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class HouseService {
	
    private final HouseRepository houseRepository;
    
    @Transactional(readOnly = true)
    public int create(HouseSaveRequestDto requestDto) {
        return houseRepository.save(requestDto.toEntity()).getHouse_id();
    }
    
    @Transactional(readOnly = true)
    public HouseResponseDto findById(int id) {
        House entity = houseRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        return new HouseResponseDto(entity);
    }
    
    @Transactional(readOnly = true)
    public List<HouseResponseDto> findAll() {
        return houseRepository.findAll().stream()
                .map(HouseResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public int update(int house_id, HouseUpdateRequestDto requestDto) {
        House house = houseRepository.findById(house_id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + house_id));
 
        house.update(requestDto.getPrice());

        return house_id;
    }
    
    @Transactional
    public void delete (int house_id) {
        House house = houseRepository.findById(house_id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 매물입니다. id=" + house_id));
        houseRepository.delete(house);
    }

    
}
