package com.example.DuAn1.entity.user_anniversary;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "couple_anniversaries")
public class CoupleAnniversary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "anniversary_id")
    private Integer anniversaryId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "partner_name", nullable = false)
    private String partnerName;

    @Column(name = "partner_dob")
    private LocalDate partnerDob;

    @Column(name = "anniversary_type", nullable = false)
    private String anniversaryType;

    @Column(name = "anniversary_date", nullable = false)
    private LocalDate anniversaryDate;

    @Column(name = "notes")
    private String notes;
}
