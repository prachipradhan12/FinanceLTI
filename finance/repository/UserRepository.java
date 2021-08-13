package com.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.finance.mapping.RetQuery;
import com.finance.mapping.UserDetails;
@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long>{
//	public UserDetails getUserDetailsByRegid(long regid);

}
