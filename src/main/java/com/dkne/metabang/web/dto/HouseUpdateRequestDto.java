package com.dkne.metabang.web.dto;

import com.dkne.metabang.domain.house.House;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HouseUpdateRequestDto {
	private long price;

	@Builder
    public HouseUpdateRequestDto(long price) {
        this.price = price;
    }

    public House toEntity() {
        return House.builder()
                    .price(price)
                    .build();
    }
}
