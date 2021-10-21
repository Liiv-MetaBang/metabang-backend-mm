package com.dkne.metabang.domain.house;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class House {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int house_id;

	@Column(length = 45, nullable = true)
	private String house_name;

	@Column(nullable = true)
	private long price;

	@Column(nullable = true)
	private int build_date;

	@Column(nullable = true)
	private int area;

	@Column(nullable = true)
	private int layer;

	@Column(length = 45, nullable = false)
	private String address;

	@Column(length = 45, nullable = false)
	private double lng;

	@Column(nullable = false)
	private double lat;

	@Builder
	public House(int house_id, String house_name, long price, int build_date, int area, int layer, Double lng,
			Double lat, String address) {
		super();
		this.house_id = house_id;
		this.house_name = house_name;
		this.price = price;
		this.build_date = build_date;
		this.area = area;
		this.layer = layer;
		this.address = address;
		this.lat = lat;
		this.lng = lng;	
	}

	public void update(long price) {
		this.price = price;
	}
}