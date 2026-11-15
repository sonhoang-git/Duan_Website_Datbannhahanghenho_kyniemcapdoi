package com.example.DuAn1.entity.user_anniversary;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserRoleId implements Serializable {
    private Integer userId;
    private Integer roleId;
}