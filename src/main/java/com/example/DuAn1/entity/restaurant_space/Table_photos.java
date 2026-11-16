package com.example.DuAn1.entity.restaurant_space;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "[table_photos]")

public class Table_photos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "[photo_id]")
    private Integer photo_id;

    @Column(name = "[photo_url]")
    private String photo_url;

    @ManyToOne
    @JoinColumn(name = "[table_id]", referencedColumnName = "[table_id]")
    private Tables tables;
}
