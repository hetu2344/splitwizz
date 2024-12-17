package com.splitwizz.object;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_expenses")
public class UserExpense {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "user_share")
    private double userShare;

    @Column(name = "paid")
    private boolean paid;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;
}
