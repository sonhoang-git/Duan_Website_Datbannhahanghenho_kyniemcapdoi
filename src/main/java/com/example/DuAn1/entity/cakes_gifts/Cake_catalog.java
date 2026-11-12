package com.example.DuAn1.entity.cakes_gifts;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[cake_catalog]")

/// -- 22. Danh mục Bánh sinh nhật / Kỷ niệm

public class Cake_catalog {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[cake_id]")
    private Integer cake_id;

    @Column(name = "[cake_name]")
    private String cake_name;

    @Column(name = "[category]")
    private String category;

    @Column(name = "[flavor]")
    private String flavor;

    @Column(name = "[size]")
    private String size;

    @Column(name = "[base_price]")
    private Float base_price;

    @Column(name = "[image_url]")
    private String image_url;

}
