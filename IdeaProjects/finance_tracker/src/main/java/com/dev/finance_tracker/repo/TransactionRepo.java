package com.dev.finance_tracker.repo;
import com.dev.finance_tracker.model.Transaction;
import  org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.time.LocalDateTime;

public interface TransactionRepo extends  JpaRepository<Transaction, Long> {
    List<Transaction> findByTimeBetween(LocalDateTime startDate, LocalDateTime endDate);
}
