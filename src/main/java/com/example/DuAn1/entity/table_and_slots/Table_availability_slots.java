package com.example.DuAn1.entity.table_and_slots;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[table_availability_slots]")

// -- 16. Lịch trạng thái bàn theo ngày & khung giờ
public class Table_availability_slots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[availability_id]")
    private Integer availability_id;

    @Column(name = "[booking_date]")
    private LocalDate booking_date;

    @Column(name = "[status]")
    private String status;

    @Column(name = "[hold_expires_at]")
    private LocalDateTime hold_expires_at;

    @ManyToOne
    @JoinColumn(name = "[table_id]", referencedColumnName = "[table_id]")
    private Tables tables;

    @ManyToOne
    @JoinColumn(name = "[slot_id]", referencedColumnName = "[slot_id]")
    private Time_slots time_slots;
}