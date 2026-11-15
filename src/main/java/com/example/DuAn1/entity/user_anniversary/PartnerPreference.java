package com.example.DuAn1.entity.user_anniversary;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "partner_preferences")
public class PartnerPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "preference_id")
    private Integer preferenceId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "favorite_flower")
    private String favoriteFlower;

    @Column(name = "favorite_color")
    private String favoriteColor;

    @Column(name = "favorite_music_genre")
    private String favoriteMusicGenre;

    @Column(name = "favorite_cuisine")
    private String favoriteCuisine;

    @Column(name = "allergies")
    private String allergies;
}
