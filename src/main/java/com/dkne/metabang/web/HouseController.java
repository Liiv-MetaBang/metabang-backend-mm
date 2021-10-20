package com.dkne.metabang.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dkne.metabang.service.HouseService;
import com.dkne.metabang.web.dto.HouseListResponseDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("v1")
public class HouseController {
	private final HouseService houseService;
	
    @GetMapping("/house/list")
    public List<HouseListResponseDto> find() {
        return houseService.findAllDesc();
    }
    
//    @GetMapping("/house/filter") 
//    public List<HouseListResponseDto> filterFind() {
//        return houseService.findAllDesc();
//    }
    
}
