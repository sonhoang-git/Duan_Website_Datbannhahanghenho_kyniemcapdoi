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
@Table(name = "[complaint_compensations]")

///-- 48. Đề xuất & Xử lý bồi hoàn dịch vụ


public class Complaint_compensations {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[compensation_id]")
    private Integer compensation_id;

    @Column(name = "[compensation_type]")
    private String compensation_type;

    @Column(name = "[amount]")
    private Float amount;

    @Column(name = "[voucher_code]")
    private String voucher_code;

    @Column(name = "[resolution_note]")
    private String resolution_note;

    @Column(name = "[resolved_at]")
    private LocalTime resolved_at;

    @ManyToOne
    @JoinColumn(name = "[complaint_id]",referencedColumnName = "[complaint_id]")
    private Customer_complaints customer_complaints;
}
