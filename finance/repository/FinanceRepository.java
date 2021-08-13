package com.finance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.model.ProductHistory;
@Repository
public interface FinanceRepository extends JpaRepository<ProductHistory, Integer> {
    public List<ProductHistory> findByRegid(int regid);
}
