package com.dev.finance_tracker.service;

import com.dev.finance_tracker.model.Account;
import com.dev.finance_tracker.repo.AccountRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepo accountRepo;

    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    public Optional<Account> getAccountById(Long id) {
        return accountRepo.findById(id); // Ensure it returns Optional<Account>
    }

    public Account createAccount(Account account) {
        return accountRepo.save(account);
    }

    public Account updateAccount(Long id, Account accountDetails) {
        Account account = accountRepo.findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        account.setName(accountDetails.getName());
        account.setBalance(accountDetails.getBalance());
        return accountRepo.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepo.deleteById(id);
    }
}
