package com.msglearning.javabackend.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserTO implements Serializable {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private int knowledge;
}
