package com.example.DuAn1.entity.cakes_gifts;


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
@Table(name = "[booking_cake_orders]")

//-- 23. Đặt bánh thiết riêng theo yêu cầu trong Đơn đặt bàn

public class Booking_cake_orders {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[cake_order_id]")
    private Integer cake_order_id;

    @Column(name = "[custom_written_text]")
    private String custom_written_text;

    @Column(name = "[reference_image_url]")
    private String reference_image_url;

    @Column(name = "[candle_type]")
    private String candle_type;

    @Column(name = "[surprise_serving_time]")
    private LocalTime surprise_serving_time;

    @Column(name = "[price]")
    private Float price;

    @ManyToOne
    @JoinColumn(name = "[cake_id]",referencedColumnName = "[cake_id]")
    private Cake_catalog cake_catalog;
}
