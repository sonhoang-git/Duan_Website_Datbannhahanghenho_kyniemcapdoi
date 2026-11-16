package com.example.DuAn1.entity.Booking;

import com.example.DuAn1.entity.restaurant_space.Restaurant;
import com.example.DuAn1.entity.restaurant_space.Tables;
import com.example.DuAn1.entity.restaurant_space.Time_slots;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[bookings]")
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[booking_id]")
    private Integer booking_id;

    @Column(name = "[booking_code]")
    private String booking_code;

    @Column(name = "[booking_date]")
    private LocalDate booking_date;

    @Column(name = "[guest_count]")
    private Integer guest_count;

    @Column(name = "[duration_hours]")
    private BigDecimal duration_hours;

    @Column(name = "[booker_name]")
    private String booker_name;

    @Column(name = "[booker_phone]")
    private String booker_phone;

    @Column(name = "[partner_name]")
    private String partner_name;

    @Column(name = "[special_notes]")
    private String special_notes;

    @Column(name = "[booking_status]")
    private String booking_status;

    @Column(name = "[created_at]")
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn(name = "[restaurant_id]", referencedColumnName = "[restaurant_id]")
    private Restaurant restaurants;

    @ManyToOne
    @JoinColumn(name = "[table_id]", referencedColumnName = "[table_id]")
    private Tables tables;

    @ManyToOne
    @JoinColumn(name = "[slot_id]", referencedColumnName = "[slot_id]")
    private Time_slots time_slots;
}
