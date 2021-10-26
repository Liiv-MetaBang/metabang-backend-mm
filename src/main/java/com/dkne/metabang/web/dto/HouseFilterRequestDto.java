package com.dkne.metabang.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HouseFilterRequestDto {
	private long low_price;
	private long high_price;
	private String address;

	@Builder
    public HouseFilterRequestDto(long low_price, long high_price, String address) {
        this.low_price = low_price;
        this.high_price = high_price;
        this.address = address;        
    }
}