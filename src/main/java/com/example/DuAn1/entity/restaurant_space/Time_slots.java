package com.example.DuAn1.entity.restaurant_space;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[time_slots]")
public class Time_slots {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[slot_id]")
    private Integer slot_id;

    @Column(name = "[slot_name]")
    private String slot_name;

    @Column(name = "[start_time]")
    private LocalTime start_time;

    @Column(name = "[end_time]")
    private LocalTime end_time;

    @Column(name = "[slot_surcharge]")
    private BigDecimal slot_surcharge;

    @ManyToOne
    @JoinColumn(name = "[restaurant_id]", referencedColumnName = "[restaurant_id]")
    private Restaurant restaurants;
}
