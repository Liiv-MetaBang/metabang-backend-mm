package com.dkne.metabang.web.dto;
import com.dkne.metabang.domain.review.Review;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReviewUpdateRequestDto {
    private String contents;
    private int score;

    @Builder
    public ReviewUpdateRequestDto(String contents, int score) {
        this.contents = contents;
        this.score = score;
    }

    public Review toEntity() {
        return Review.builder()
                     .contents(contents)
                     .score(score)
                     .build();
    }
}
