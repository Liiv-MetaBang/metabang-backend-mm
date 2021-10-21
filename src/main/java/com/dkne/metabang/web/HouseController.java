package com.dkne.metabang.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dkne.metabang.service.HouseService;
import com.dkne.metabang.web.dto.HouseResponseDto;
import com.dkne.metabang.web.dto.HouseSaveRequestDto;
import com.dkne.metabang.web.dto.HouseUpdateRequestDto;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/api")
public class HouseController {
	private final HouseService houseService;
	
	@ApiOperation(value = "테스트 API")
	@GetMapping("/hello")
    public String hello() {
        return "Hello House Controller :)";
    }

    // create house info
	@ApiOperation(value = "매물 정보 등록", notes = "성공시 등록된 매물의 ID를 반환합니다.")
    @PostMapping("/house")
    public int createHouse(@RequestBody HouseSaveRequestDto requestDto) {
        return houseService.create(requestDto);
    }

	// show house info
	@ApiOperation(value = "매물 정보 조회", notes = "성공시 특정 매물의 정보를 반환합니다.")
	@GetMapping("/house/{house_id}")
	public HouseResponseDto showHouse(@PathVariable int house_id) {
		return houseService.findById(house_id);
	}

	// show all house info
	@ApiOperation(value = "모든 매물 정보 조회", notes = "성공시 모든 매물의 정보를 반환합니다.")
	@GetMapping("/house")
	public List<HouseResponseDto> showAllHouse(@PathVariable int house_id) {
		return houseService.findAll();
	}

    // update house info
	@ApiOperation(value = "매물 정보 수정", notes = "성공시 수정된 매물의 ID를 반환합니다.")
    @PutMapping("/house/{house_id}")
    public int updateHouse(@PathVariable  int house_id, @RequestBody HouseUpdateRequestDto requestDto){
        return houseService.update(house_id, requestDto);
    }

    // delecte house
	@ApiOperation(value = "매물 정보 삭제", notes = "성공시 삭제된 매물의 ID를 반환합니다.")
    @DeleteMapping("/house/{house_id}")
    public int deleteHouse(@PathVariable int house_id) {
    	houseService.delete(house_id);
        return house_id;
    }
}
