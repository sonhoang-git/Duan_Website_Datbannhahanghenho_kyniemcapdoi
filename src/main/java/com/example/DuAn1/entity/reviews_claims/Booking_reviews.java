package com.example.DuAn1.entity.reviews_claims;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[booking_reviews]")

///-- 45. Đánh giá trải nghiệm buổi hẹn hò
public class Booking_reviews {

    @Id // Khai báo đây là khóa chính
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
    private String comment; // Đã sửa từ LocalTime thành String

    @Column(name = "[created_at]")
    private LocalDateTime created_at; // Nên dùng LocalDateTime thay cho String để dễ truy vấn ngày tháng
}