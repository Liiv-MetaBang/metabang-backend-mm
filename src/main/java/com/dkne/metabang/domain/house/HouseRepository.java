package com.dkne.metabang.domain.house;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository  extends JpaRepository<House, Integer> {
	List<House> findAllDesc();
}
