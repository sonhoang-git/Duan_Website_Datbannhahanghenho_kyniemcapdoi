package com.example.DuAn1.entity.THEMES_DECOR;

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
@Table(name = "[theme_gallery]")
public class theme_gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[gallery_id]")
    private Integer gallery_id;

    @Column(name = "[theme_id]")
    private Integer theme_id;

    @Column(name = "[image_url]")
    private String image_url;

    @Column(name = "[color_tone]")
    private String color_tone;

}
