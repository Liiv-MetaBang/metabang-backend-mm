package com.dkne.metabang.domain.image;

import com.dkne.metabang.domain.house.House;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Builder
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int image_id;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;

    @Column(length = 50)
    private String img;

    public Image(int image_id, House house, String img) {
        this.image_id = image_id;
        this.house = house;
        this.img = img;
    }
}
