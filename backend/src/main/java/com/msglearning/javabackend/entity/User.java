package com.msglearning.javabackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;


@Data
@Table(name = User.TABLE_NAME)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    static final String TABLE_NAME = "user";

    public User(Long id, String firstName, String lastName, String email, String phone, String profileImage, int occupation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.profileImage = profileImage;
        this.knowledge = occupation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column(unique = true,
            nullable = false)
    private String email;

    @Column(unique = true,
            nullable = false)
    private String phone;

    @Column
    private String profileImage;

    @Column
    @Min(1)
    @Max(5)
    private int knowledge;
}
