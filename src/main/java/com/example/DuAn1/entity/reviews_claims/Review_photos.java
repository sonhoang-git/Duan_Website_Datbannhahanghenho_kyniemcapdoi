package com.example.DuAn1.entity.reviews_claims;

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
@Table(name = "[review_photos]")
//-- 46. Hình ảnh đính kèm bài đánh giá
public class Review_photos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[photo_id]")
    private Integer photo_id;

    @Column(name = "[photo_url]")
    private String photo_url;

    @ManyToOne
    @JoinColumn(name = "[review_id]", referencedColumnName = "[review_id]")
    private Booking_reviews booking_reviews;
}