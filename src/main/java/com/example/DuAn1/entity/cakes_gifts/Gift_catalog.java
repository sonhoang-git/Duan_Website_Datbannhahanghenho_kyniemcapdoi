package com.example.DuAn1.entity.cakes_gifts;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[gift_catalog]")

///-- 24. Danh mục Hoa tươi & Quà tặng

public class Gift_catalog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[gift_id]")
    private Integer gift_id;

    @Column(name = "[gift_name]")
    private String gift_name;

    @Column(name = "[category]")
    private String category;

    @Column(name = "[description]")
    private String description;

    @Column(name = "[price]")
    private Float price;

    @Column(name = "[image_url]")
    private String image_url;
}
