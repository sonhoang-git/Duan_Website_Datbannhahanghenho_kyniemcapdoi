package com.example.DuAn1.entity.Booking;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[event_progress_logs]")
public class Event_progress_logs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[log_id]")
    private Integer log_id;

    @Column(name = "[status_step]")
    private String status_step;

    @Column(name = "[note]")
    private String note;

    @Column(name = "[logged_at]")
    private LocalDateTime logged_at;

    @ManyToOne
    @JoinColumn(name = "[booking_id]", referencedColumnName = "[booking_id]")
    private Bookings bookings;
}
