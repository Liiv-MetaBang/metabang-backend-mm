package com.dkne.metabang.web.dto;

import com.dkne.metabang.domain.review.Review;

import java.time.LocalDate;

public class ReviewResponseDto {
    private int score;
    private String contents;
    private LocalDate created_date;

    public ReviewResponseDto(Review entity) {
        this.score = entity.getScore();
        this.contents = entity.getContents();
        this.created_date = entity.getCreated_date();
    }
}
