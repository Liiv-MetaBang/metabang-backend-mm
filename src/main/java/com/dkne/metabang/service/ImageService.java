package com.dkne.metabang.service;

import com.dkne.metabang.domain.house.House;
import com.dkne.metabang.domain.house.HouseRepository;
import com.dkne.metabang.domain.image.Image;
import com.dkne.metabang.domain.image.ImageRepository;
import com.dkne.metabang.web.dto.HouseResponseDto;
import com.dkne.metabang.web.dto.ImageResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ImageService {
    private final ImageRepository imageRepository;

    @Transactional(readOnly = true)
    public ImageResponseDto findById(int image_id) {
        Image entity = imageRepository.findById(image_id)
                .orElseThrow(() -> new IllegalArgumentException("해당 이미지가 없습니다. id=" + image_id));

        return new ImageResponseDto(entity);
    }

}
