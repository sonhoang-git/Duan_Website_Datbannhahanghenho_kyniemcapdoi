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
@Table(name = "[booking_refunds]")
public class Booking_refunds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[refund_id]")
    private Integer refund_id;

    @Column(name = "[cancellation_reason]")
    private String cancellation_reason;

    @Column(name = "[cancellation_fee]")
    private BigDecimal cancellation_fee;

    @Column(name = "[refund_amount]")
    private BigDecimal refund_amount;

    @Column(name = "[refund_status]")
    private String refund_status;

    @Column(name = "[processed_at]")
    private LocalDateTime processed_at;

    @ManyToOne
    @JoinColumn(name = "[booking_id]", referencedColumnName = "[booking_id]")
    private Bookings bookings;
}
