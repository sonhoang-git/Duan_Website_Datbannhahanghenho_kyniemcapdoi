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
@Table(name = "[tables]")
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[table_id]")
    private Integer table_id;

    @Column(name = "[table_number]")
    private String table_number;

    @Column(name = "[capacity]")
    private Integer capacity;

    @Column(name = "[is_window_side]")
    private Boolean is_window_side;

    @Column(name = "[has_city_view]")
    private Boolean has_city_view;

    @Column(name = "[has_curtain_divider]")
    private Boolean has_curtain_divider;

    @Column(name = "[is_quiet_zone]")
    private Boolean is_quiet_zone;

    @Column(name = "[surcharge]")
    private BigDecimal surcharge;

    @Column(name = "[status]")
    private String status;

    @ManyToOne
    @JoinColumn(name = "[area_id]", referencedColumnName = "[area_id]")
    private Restaurant_areas restaurant_areas;
}
