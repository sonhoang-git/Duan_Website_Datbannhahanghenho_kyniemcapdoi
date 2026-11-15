package com.example.DuAn1.entity.restaurant_master;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "restaurant_service_fees")
public class RestaurantServiceFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fee_id")
    private Integer feeId;

    @Column(name = "restaurant_id", nullable = false)
    private Integer restaurantId;

    @Column(name = "fee_name", nullable = false)
    private String feeName;

    @Column(name = "amount", nullable = false)
    private Float amount;

    @Column(name = "is_percentage", nullable = false)
    private Boolean isPercentage;
}
