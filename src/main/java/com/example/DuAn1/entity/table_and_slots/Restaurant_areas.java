package com.example.DuAn1.entity.table_and_slots;

import com.example.DuAn1.entity.restaurant_master.Restaurant;
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

// -- 12. Khu vực không gian trong nhà hàng (Phòng riêng, Ban công, Sân vườn...)
public class Restaurant_areas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[area_id]")
    private Integer area_id;

    @ManyToOne
    @JoinColumn(name = "[restaurant_id]", referencedColumnName = "[restaurant_id]")
    private Restaurant restaurant;


    @Column(name = "[area_name]")
    private String area_name;

    @Column(name = "[privacy_level]")
    private String privacy_level;

    @Column(name = "[description]")
    private String description;
}