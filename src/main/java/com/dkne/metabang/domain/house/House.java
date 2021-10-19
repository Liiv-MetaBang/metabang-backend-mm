package com.dkne.metabang.domain.house;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Date;

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

    @Temporal(TemporalType.DATE)
    private Date build_date;
    
    @Column(nullable = true)
    private int area;
    
    @Column(nullable = true)
    private int floor;
    
    @Column(length = 45, nullable = false)
    private double lng;

    @Column(nullable = false)
    private double lat;
    
    @Column(length = 45, nullable = false)
    private String address;
    
    @Builder
	public House(int house_id, String house_name, long price, Date build_date, int area, int floor, Double lng,
			Double lat, String address) {
		super();
		this.house_id = house_id;
		this.house_name = house_name;
		this.price = price;
		this.build_date = build_date;
		this.area = area;
		this.floor = floor;
		this.lng = lng;
		this.lat = lat;
		this.address = address;
	}

    
}