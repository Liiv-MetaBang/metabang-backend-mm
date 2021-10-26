package com.dkne.metabang.domain.house;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HouseRepository extends JpaRepository<House, Integer>, JpaSpecificationExecutor<House> {

    List<House> findAllByAddressContaining(String Address);
    List<House> findAllByPriceBetween(long low_layer, long high_layer);
}
