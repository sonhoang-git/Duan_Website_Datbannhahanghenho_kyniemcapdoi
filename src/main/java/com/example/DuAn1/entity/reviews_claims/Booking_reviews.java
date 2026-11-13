package com.example.DuAn1.entity.reviews_claims;


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
@Table(name = "[booking_reviews]")

///-- 45. Đánh giá trải nghiệm buổi hẹn hò


public class Booking_reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[review_id]")
    private Integer review_id;

    @Column(name = "[overall_rating]")
    private Integer overall_rating;

    @Column(name = "[privacy_rating]")
    private Integer privacy_rating;

    @Column(name = "[food_rating]")
    private Integer food_rating;

    @Column(name = "[decor_rating]")
    private Integer decor_rating;

    @Column(name = "[service_rating]")
    private Integer service_rating;

    @Column(name = "[comment]")
    private LocalTime comment;

    @Column(name = "[created_at]")
    private String created_at;


    //Có join bảng mà chưa join
}
