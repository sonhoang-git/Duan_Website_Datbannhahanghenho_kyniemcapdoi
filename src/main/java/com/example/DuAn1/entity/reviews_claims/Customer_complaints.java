package com.example.DuAn1.entity.reviews_claims;


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
@Table(name = "[customer_complaints]")

//-- 47. Báo cáo & Khiếu nại dịch vụ không đúng cam kết

public class Customer_complaints {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[complaint_id]")
    private Integer complaint_id;

    @Column(name = "[complaint_type]")
    private String complaint_type;

    @Column(name = "[content]")
    private String content;

    @Column(name = "[status]")
    private String status;

    @Column(name = "[created_at]")
    private LocalTime created_at;

    // có join bảng mà chưa join
}
