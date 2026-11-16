package com.example.DuAn1.entity.restaurant_space;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[restaurants]")
public class Restaurants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[restaurant_id]")
    private Integer restaurant_id;

    @Column(name = "[restaurant_name]")
    private String restaurant_name;

    @Column(name = "[phone]")
    private String phone;

    @Column(name = "[email]")
    private String email;

    @Column(name = "[address]")
    private String address;

    @Column(name = "[district]")
    private String district;

    @Column(name = "[city]")
    private String city;

    @Column(name = "[latitude]")
    private BigDecimal latitude;

    @Column(name = "[longitude]")
    private BigDecimal longitude;

    @Column(name = "[cuisine_type]")
    private String cuisine_type;

    @Column(name = "[avg_price_per_couple]")
    private BigDecimal avg_price_per_couple;

    @Column(name = "[romantic_rating]")
    private BigDecimal romantic_rating;

    @Column(name = "[status]")
    private String status;
}
