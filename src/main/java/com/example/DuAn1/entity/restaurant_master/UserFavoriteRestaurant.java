package com.example.DuAn1.entity.restaurant_master;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_favorite_restaurants")
public class UserFavoriteRestaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "favorite_id")
    private Integer favoriteId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "restaurant_id", nullable = false)
    private Integer restaurantId;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
