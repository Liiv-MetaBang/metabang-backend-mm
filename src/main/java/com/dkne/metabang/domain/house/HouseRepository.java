package com.dkne.metabang.domain.house;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HouseRepository extends JpaRepository<House, Integer>, JpaSpecificationExecutor<House> {

}
