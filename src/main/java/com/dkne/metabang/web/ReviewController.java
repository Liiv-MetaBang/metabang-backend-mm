package com.dkne.metabang.web;

import java.util.List;

import com.dkne.metabang.domain.review.Review;
import com.dkne.metabang.web.dto.ReviewSaveRequestDto;
import com.dkne.metabang.web.dto.ReviewUpdateRequestDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dkne.metabang.service.ReviewService;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("/v1/api/review")
public class ReviewController {
    private final ReviewService reviewService;

    @ApiOperation(value = "테스트 API")
    @GetMapping("/helloReview")
    public String helloReview() {
        return "Hello Review Controller :)";
    }

    // create house info
    @ApiOperation(value = "리뷰 정보 등록", notes = "성공시 등록된 리뷰의 ID를 반환합니다.")
    @PostMapping("/")
    public int createReview(@RequestBody ReviewSaveRequestDto requestDto) {
        return reviewService.create(requestDto);
    }

    // show all review info
    @ApiOperation(value = "해당 매물의 모든 리뷰 정보 조회", notes = "성공시 모든 리뷰의 정보를 반환합니다.")
    @GetMapping("/{house_id}")
    public List<Review> findAll(int house_id) {
        return reviewService.findAll(house_id);
    }

    // update house info
    @ApiOperation(value = "리뷰 수정", notes = "성공시 수정된 리뷰의 ID를 반환합니다.")
    @PutMapping("/{review_id}")
    public int updateReview(@PathVariable  int review_id, @RequestBody ReviewUpdateRequestDto requestDto){
        return reviewService.update(review_id, requestDto);
    }

    // delecte house
    @ApiOperation(value = "리뷰 정보 삭제", notes = "성공시 삭제된 리뷰의 ID를 반환합니다.")
    @DeleteMapping("/{review_id}")
    public int deleteReview(@PathVariable int review_id) {
        reviewService.delete(review_id);
        return review_id;
    }
}
