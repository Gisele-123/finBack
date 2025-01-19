package com.dev.finance_tracker.service;

import com.dev.finance_tracker.model.Budget;
import com.dev.finance_tracker.repo.BudgetRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BudgetService {
    private final BudgetRepo budgetRepo;

    public BudgetService(BudgetRepo budgetRepo) {
        this.budgetRepo = budgetRepo;
    }

    public List<Budget> getAllBudgets() {
        return budgetRepo.findAll();
    }

    public Budget createBudget(Budget budget) {
        return budgetRepo.save(budget);
    }

    public Optional<Budget> getBudget(Long id) {
        return budgetRepo.findById(id);
    }

    public Budget updateBudget(Long id, Budget budgetDetails) {
        Budget budget = budgetRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Budget not found with id " + id));
        budget.setBudget_limit(budgetDetails.getBudget_limit());
        budget.setStartDate(budgetDetails.getStartDate());
        budget.setEndDate(budgetDetails.getEndDate());
        return budgetRepo.save(budget);
    }

    public void deleteBudget(Long id) {
        budgetRepo.deleteById(id);
    }
}
