package com.dev.finance_tracker.model;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String description;

    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private Double amount;
    private  LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private  Category category;

    public enum TransactionType {
        INCOME, EXPENSE
    }
}
