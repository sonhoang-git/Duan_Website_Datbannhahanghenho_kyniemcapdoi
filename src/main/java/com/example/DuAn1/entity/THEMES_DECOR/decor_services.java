package com.example.DuAn1.entity.THEMES_DECOR;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.poi.hpsf.Decimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[decor_services]")
public class decor_services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[service_id]")
    private Integer service_id;

    @Column(name = "[service_code]")
    private Integer service_code;

    @Column(name = "[service_name]")
    private String service_name;

    @Column(name = "[category]")
    private String category;

    @Column(name = "[unit_price]")
    private Float unit_price;
}
