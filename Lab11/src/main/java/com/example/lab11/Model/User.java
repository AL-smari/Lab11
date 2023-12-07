package com.example.lab11.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    @NotEmpty(message = "username should not be empty")
    @Size(min = 4 , message = "username should not be less than 4")
    @Column(columnDefinition = "varchar(255) not null")
    private String username;
    @NotEmpty(message = "email should not be empty")
    @Email(message = "must be valid email")
    @Column(columnDefinition = "varchar(255) not null")
    private String email;
    @NotEmpty(message = "password should not be empty")
    @Column(columnDefinition = "varchar(255) not null")
    private String password;
    @NotNull(message = "registration date should not be empty")
    private Date regisration_date;
}
