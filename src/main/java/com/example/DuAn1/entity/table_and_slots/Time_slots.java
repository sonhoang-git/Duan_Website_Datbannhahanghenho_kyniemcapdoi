package com.example.DuAn1.entity.table_and_slots;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[time_slots]")

// -- 15. Ca phục vụ / Khung giờ đặt bàn
public class Time_slots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[slot_id]")
    private Integer slot_id;

    // Tương tự bảng Restaurant_areas, nếu đã có class Restaurants thì bạn đổi sang @ManyToOne nhé
    @Column(name = "[restaurant_id]")
    private Integer restaurant_id;

    @Column(name = "[slot_name]")
    private String slot_name;

    @Column(name = "[start_time]")
    private LocalTime start_time;

    @Column(name = "[end_time]")
    private LocalTime end_time;

    @Column(name = "[slot_surcharge]")
    private Float slot_surcharge;
}