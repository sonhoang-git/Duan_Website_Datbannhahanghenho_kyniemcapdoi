package com.example.DuAn1.entity.Booking;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[booking_payments]")
public class Booking_payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[payment_id]")
    private Integer payment_id;

    @Column(name = "[payment_type]")
    private String payment_type;

    @Column(name = "[payment_method]")
    private String payment_method;

    @Column(name = "[transaction_code]")
    private String transaction_code;

    @Column(name = "[amount]")
    private BigDecimal amount;

    @Column(name = "[payment_status]")
    private String payment_status;

    @Column(name = "[paid_at]")
    private LocalDateTime paid_at;

    @ManyToOne
    @JoinColumn(name = "[booking_id]", referencedColumnName = "[booking_id]")
    private Bookings bookings;
}
