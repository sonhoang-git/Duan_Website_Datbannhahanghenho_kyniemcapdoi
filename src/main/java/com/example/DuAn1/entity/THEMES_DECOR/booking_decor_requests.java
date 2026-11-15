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
@Table(name = "[booking_decor_requests]")
public class booking_decor_requests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[decor_request_id]")
    private Integer decor_request_id;

    @Column(name = "[theme_id]")
    private Integer theme_id;

    @Column(name = "[color_tone]")
    private String color_tone;

    @Column(name = "[table_style]")
    private String table_style;

    @Column(name = "[custom_text_content]")
    private String custom_text_content;

    @Column(name = "[custom_uploaded_photo_url]")
    private String custom_uploaded_photo_url;

    @Column(name = "[keep_secret]")
    private String keep_secret;

    @Column(name = "[setup_deadline_time]")
    private String setup_deadline_time;

    @Column(name = "[custom_design_proof_url]")
    private String custom_design_proof_url;

    @Column(name = "[status]")
    private String status;
}
