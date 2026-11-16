package com.example.DuAn1.entity.Booking;

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
@Table(name = "[booking_bill_summaries]")
public class Booking_bill_summaries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[bill_id]")
    private Integer bill_id;

    @Column(name = "[table_surcharge]")
    private BigDecimal table_surcharge;

    @Column(name = "[decor_cost]")
    private BigDecimal decor_cost;

    @Column(name = "[cake_cost]")
    private BigDecimal cake_cost;

    @Column(name = "[gift_cost]")
    private BigDecimal gift_cost;

    @Column(name = "[menu_cost]")
    private BigDecimal menu_cost;

    @Column(name = "[photography_cost]")
    private BigDecimal photography_cost;

    @Column(name = "[discount_amount]")
    private BigDecimal discount_amount;

    @Column(name = "[total_amount]")
    private BigDecimal total_amount;

    @Column(name = "[deposit_amount]")
    private BigDecimal deposit_amount;

    @Column(name = "[remaining_amount]")
    private BigDecimal remaining_amount;

    @OneToOne
    @JoinColumn(name = "[booking_id]", referencedColumnName = "[booking_id]", unique = true)
    private Bookings bookings;
}
