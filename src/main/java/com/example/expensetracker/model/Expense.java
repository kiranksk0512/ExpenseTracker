package com.example.expensetracker.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="T_EXPENSE")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long expenseId;

    private String expenseName;

    private Double expenseValue;

    private Date dateOfExpense;
}
