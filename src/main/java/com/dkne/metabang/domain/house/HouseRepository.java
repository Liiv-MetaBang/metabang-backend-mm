package com.dkne.metabang.domain.house;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HouseRepository  extends JpaRepository<House, Integer> {
	
	@Query("SELECT h FROM House h ORDER BY h.house_id DESC")
	List<House> findAllDesc();
}
