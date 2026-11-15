package com.example.DuAn1.entity.THEMES_DECOR;

import com.example.DuAn1.entity.cakes_gifts.Cake_catalog;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.poi.hpsf.Decimal;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[romantic_themes]")
public class romantic_themes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[theme_id]")
    private Integer theme_id;

    @Column(name = "[theme_code]")
    private String theme_code;

    @Column(name = "[theme_name]")
    private String theme_name;

    @Column(name = "[description]")
    private String description;

    @Column(name = "[base_price]")
    private Float base_price;

}
