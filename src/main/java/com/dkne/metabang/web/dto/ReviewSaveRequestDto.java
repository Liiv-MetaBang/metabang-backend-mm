package com.dkne.metabang.web.dto;
import com.dkne.metabang.domain.house.House;
import com.dkne.metabang.domain.review.Review;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReviewSaveRequestDto {
    private String contents;
    private int score;
    private int house_id;

    @Builder
    public ReviewSaveRequestDto(String contents, int score, int house_id) {
        this.contents = contents;
        this.score = score;
        this.house_id = house_id;
    }

    public Review toEntity() {
        return Review.builder()
                     .contents(contents)
                     .score(score)
                     .build();
    }

}
