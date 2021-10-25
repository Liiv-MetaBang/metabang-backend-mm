package com.dkne.metabang.web.dto;

import com.dkne.metabang.domain.image.Image;
import lombok.Getter;

@Getter
public class ImageResponseDto {
    private String img;

    public ImageResponseDto(Image entity) {
        this.img = entity.getImg();
    }
}
