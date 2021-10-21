package com.dkne.metabang.web.dto;

import java.util.Date;

import com.dkne.metabang.domain.house.House;

import lombok.Getter;

@Getter
public class HouseListResponseDto {
	private int house_id;
	private String house_name;
	private long price;
	private Date build_date;
	private int area;
	private int floor;
	private String address;
	private double lat;
	private double lng;

	public HouseListResponseDto(House entity) {
		this.house_id = entity.getHouse_id();
		this.house_name = entity.getHouse_name();
		this.price = entity.getPrice();
		this.build_date = entity.getBuild_date();
		this.area = entity.getArea();
		this.floor = entity.getFloor();
		this.address = entity.getAddress();
		this.lat = entity.getLat();
		this.lng = entity.getLng();
	}
}
