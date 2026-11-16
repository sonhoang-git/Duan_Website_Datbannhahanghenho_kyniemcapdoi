package com.example.DuAn1.entity.restaurant_space;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[restaurant_areas]")
public class Restaurant_areas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[area_id]")
    private Integer area_id;

    @Column(name = "[area_name]")
    private String area_name;

    @Column(name = "[privacy_level]")
    private String privacy_level;

    @Column(name = "[description]")
    private String description;

    @ManyToOne
    @JoinColumn(name = "[restaurant_id]", referencedColumnName = "[restaurant_id]")
    private Restaurant restaurants;
}
