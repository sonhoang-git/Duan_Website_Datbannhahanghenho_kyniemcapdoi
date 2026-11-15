package com.example.DuAn1.entity.restaurant_master;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "restaurant_policies")
public class RestaurantPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_id")
    private Integer policyId;

    @Column(name = "restaurant_id", nullable = false)
    private Integer restaurantId;

    @Column(name = "cancellation_lead_hours", nullable = false)
    private Integer cancellationLeadHours;

    @Column(name = "refund_percentage", nullable = false)
    private Float refundPercentage;

    @Column(name = "deposit_requirement_percent", nullable = false)
    private Float depositRequirementPercent;

    @Column(name = "max_hold_time_minutes")
    private Integer maxHoldTimeMinutes;

    @Column(name = "policy_terms")
    private String policyTerms;
}
