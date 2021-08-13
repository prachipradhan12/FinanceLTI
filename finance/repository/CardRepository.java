package com.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.mapping.CardDetails;
@Repository
public interface CardRepository extends JpaRepository<CardDetails, Long> {

}
