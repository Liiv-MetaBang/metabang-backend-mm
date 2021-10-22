package com.dkne.metabang.domain.review;

import com.dkne.metabang.domain.house.House;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
@Builder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;

//    @Column(nullable = false)
//    private int house_id;

    @CreatedDate
    private LocalDate created_date;

    @Column(length = 300, nullable = false)
    private String contents;

    @Column(nullable = false)
    private int score;

    @Builder
    public Review(int review_id, House house, LocalDate created_date, String contents, int score) {
        this.review_id = review_id;
        this.house = house;
        this.created_date = LocalDate.now();
        this.contents = contents;
        this.score = score;
    }

    public void update(String contents,int score){
        this.contents = contents;
        this.score = score;
    }

}
