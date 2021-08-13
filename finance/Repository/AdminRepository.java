package com.finance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.Model.Userdetails;

@Repository
public interface AdminRepository extends JpaRepository<Userdetails, Integer>  {
	

}



