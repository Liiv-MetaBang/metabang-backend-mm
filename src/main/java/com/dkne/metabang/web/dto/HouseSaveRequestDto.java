package com.dkne.metabang.web.dto;

import com.dkne.metabang.domain.house.House;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HouseSaveRequestDto {
	private String house_name;
	private long price;
	private int build_date;
	private int area;
	private int layer;
	private String address;
	private double lat;
	private double lng;

	@Builder
    public HouseSaveRequestDto(String house_name, long price, int build_date, int area, int layer, String address, double lat, double lng) {
        this.house_name = house_name;
        this.price = price;
        this.build_date = build_date;
        this.area = area;
        this.layer = layer;        
        this.address = address;        
        this.lat = lat;        
        this.lng = lng;        
    }

    public House toEntity() {
        return House.builder()
                    .house_name(house_name)
                    .price(price)
                    .build_date(build_date)
                    .area(area)
                    .layer(layer)
                    .address(address)
                    .lat(lat)
                    .lng(lng)
                    .build();
    }
}
