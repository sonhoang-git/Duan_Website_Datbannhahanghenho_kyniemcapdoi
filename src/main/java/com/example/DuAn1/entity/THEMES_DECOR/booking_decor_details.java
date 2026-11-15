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
@Table(name = "[booking_decor_details]")
public class booking_decor_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[detail_id]")
    private Integer detail_id;

    @Column(name = "[decor_request_id]")
    private Integer decor_request_id;

    @Column(name = "[service_id]")
    private String service_id;

    @Column(name = "[quantity]")
    private String quantity;

    @Column(name = "[unit_price]")
    private Float unit_price;

}
