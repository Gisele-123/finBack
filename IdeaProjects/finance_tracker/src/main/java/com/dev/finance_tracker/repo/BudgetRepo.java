package com.dev.finance_tracker.repo;
import com.dev.finance_tracker.model.Budget;
import  org.springframework.data.jpa.repository.JpaRepository;


public interface BudgetRepo extends  JpaRepository<Budget, Long>{
}
