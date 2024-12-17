package com.splitwizz.object;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "expense_id")
    private long id;

    @Column(name = "posted_date")
    private Date postedDate;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "posted_by")
    private User postedBy;

    @OneToMany(mappedBy = "expense", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserExpense> userExpense;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group postedIn;

    @Column(name = "amount")
    private double amount;

    @Column(name = "currency")
    private String currency;
}
