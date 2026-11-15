package com.example.DuAn1.entity.user_anniversary;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(UserRoleId.class)
@Table(name = "user_roles")
public class UserRole {

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "assigned_at", nullable = false)
    private LocalDateTime assignedAt;
}
