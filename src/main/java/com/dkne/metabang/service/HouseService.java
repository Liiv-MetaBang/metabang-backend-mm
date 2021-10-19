package com.dkne.metabang.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dkne.metabang.domain.house.HouseRepository;
import com.dkne.metabang.web.dto.HouseListResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service

public class HouseService {
	
    private final HouseRepository houseRepository;

    @Transactional(readOnly = true)
    public List<HouseListResponseDto> findAllDesc() {
        return houseRepository.findAllDesc().stream()
                .map(HouseListResponseDto::new)
                .collect(Collectors.toList());
    }

}
