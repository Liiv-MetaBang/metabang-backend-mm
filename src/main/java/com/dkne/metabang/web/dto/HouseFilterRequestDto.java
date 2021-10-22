package com.dkne.metabang.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HouseFilterRequestDto {
	private int low_layer;
	private int high_layer;
	private String address;

	@Builder
    public HouseFilterRequestDto(int low_layer, int high_layer, String address) {
        this.low_layer = low_layer;
        this.high_layer = high_layer;
        this.address = address;        
    }
}