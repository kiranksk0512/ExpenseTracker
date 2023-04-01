package com.example.expensetracker.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="T_USER")
@Getter
@Setter
@Builder
public class User {
   @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer userID;

    private String userName;

    private String password;

    private Date dateOfCreation;
}
