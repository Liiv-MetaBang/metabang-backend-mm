package com.dkne.metabang.web;

import com.dkne.metabang.domain.image.Image;
import com.dkne.metabang.service.HouseService;
import com.dkne.metabang.service.ImageService;
import com.dkne.metabang.web.dto.HouseResponseDto;
import com.dkne.metabang.web.dto.ImageResponseDto;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/api/image")
public class ImageController {
    private final ImageService imageService;

    @ApiOperation(value = "이미지 테스트 API")
    @GetMapping("/helloImg")
    public String hello() {
        return "Hello Img Controller :)";
    }

    // show img info test 1
    @ApiOperation(value = "이미지 정보 조회", notes = "성공시 특정 이미지의 정보를 반환합니다.")
    @GetMapping("/{image_id}")
    public ImageResponseDto showImage(@PathVariable int image_id) {
        return imageService.findById(image_id);
    }

    // show all detail image info
    @ApiOperation(value = "모든 이미지 정보 조회", notes = "성공시 한 매물의 모든 상세 이미지의 정보를 반환합니다.")
    @GetMapping("/detail/{house_id}")
    public List<Image> showAllHouse(@PathVariable int house_id) {
        return imageService.findAll(house_id);
    }

}
