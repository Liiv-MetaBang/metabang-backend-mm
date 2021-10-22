package com.dkne.metabang.domain.review;

import com.dkne.metabang.web.dto.ReviewResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository  extends JpaRepository<Review, Integer>, JpaSpecificationExecutor<Review> {

//    @Query("SELECT r FROM Review r left outer join house on house.house_id = #{house_id}")
//    List<ReviewResponseDto> findAllReview();
}
