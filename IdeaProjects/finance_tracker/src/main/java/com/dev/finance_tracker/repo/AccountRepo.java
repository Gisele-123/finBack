package com.dev.finance_tracker.repo;
import com.dev.finance_tracker.model.Account;
import  org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepo extends  JpaRepository<Account, Long>{
}
