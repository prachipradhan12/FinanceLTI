package com.finance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.Model.Carddetails;


@Repository
public interface CardRepository extends JpaRepository<Carddetails, Integer> {
	//public List<Carddetails> findByRegId(long regid);
}








