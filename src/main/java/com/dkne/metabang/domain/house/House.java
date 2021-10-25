package com.dkne.metabang.domain.house;

import javax.persistence.*;

import com.dkne.metabang.domain.image.Image;
import com.dkne.metabang.domain.review.Review;
import com.dkne.metabang.web.dto.ReviewResponseDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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

	@JsonIgnore
	@OneToMany(mappedBy = "house")
	private List<Review> reviews = new ArrayList<Review>();

	@JsonIgnore
	@OneToMany(mappedBy = "house")
	private List<Image> images = new ArrayList<Image>();

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