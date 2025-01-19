package com.dev.finance_tracker.repo;
import com.dev.finance_tracker.model.Category;
import  org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepo extends  JpaRepository<Category, Long>{
}
