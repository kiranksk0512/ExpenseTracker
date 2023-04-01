package com.example.expensetracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="T_GROUP")
@Getter
@Setter
@Builder
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long groupID;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    private String groupName;

    private Date dateOfCreation;
}
