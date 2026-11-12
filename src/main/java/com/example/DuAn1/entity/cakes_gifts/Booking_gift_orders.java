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
@Table(name = "[booking_gift_orders]")

// -- 25. Đặt hoa & quà kèm thiệp chúc mừng

public class Booking_gift_orders {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[gift_order_id]")
    private Integer gift_order_id;

    @Column(name = "[card_message_content]")
    private String card_message_content;

    @Column(name = "[reference_image_url]")
    private String reference_image_url;

    @Column(name = "[delivery_time_spot]")
    private LocalTime delivery_time_spot;

    @Column(name = "[price]")
    private Float price;

    @ManyToOne
    @JoinColumn(name = "[gift_id]",referencedColumnName = "[gift_id]")
    private Gift_catalog gift_catalog;
}
