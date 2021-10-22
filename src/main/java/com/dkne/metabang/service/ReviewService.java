package com.dkne.metabang.service;

import com.dkne.metabang.domain.house.House;
import com.dkne.metabang.domain.house.HouseRepository;
import com.dkne.metabang.domain.review.Review;
import com.dkne.metabang.domain.review.ReviewRepository;
import com.dkne.metabang.web.dto.ReviewSaveRequestDto;
import com.dkne.metabang.web.dto.ReviewUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Service
public class ReviewService {

    private final HouseRepository houseRepository;
    private final ReviewRepository reviewRepository;

    @Transactional
    public int create(ReviewSaveRequestDto requestDto) {

        House house = houseRepository.getById(requestDto.getHouse_id());

        return reviewRepository.save(Review.builder()
                .score(requestDto.getScore())
                .contents(requestDto.getContents())
                .house(house)
                .build()).getReview_id();
    }

    @Transactional(readOnly = true)
    public List<Review> findAll(int house_id) {

        return houseRepository.findById(house_id).get().getReviews();

    }

    @Transactional
    public int update(int review_id, ReviewUpdateRequestDto requestDto) {
        Review review = reviewRepository.findById(review_id)
                .orElseThrow(() -> new IllegalArgumentException("해당 리뷰가 없습니다. review_id=" + review_id));

        review.update(requestDto.getContents(), requestDto.getScore());

        return review_id;
    }

    @Transactional
    public void delete (int review_id) {
        Review review = reviewRepository.findById(review_id)
                .orElseThrow(() -> new IllegalArgumentException("해당 리뷰가 없습니다. review_id=" + review_id));

        reviewRepository.delete(review);
    }
}
