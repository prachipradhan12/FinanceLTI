package com.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.finance.mapping.RetQuery;
import com.finance.mapping.UserDetails;
@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long>{
	 @Query("SELECT u FROM UserDetails u JOIN u.cardDetails c WHERE u.regid=?1")
	  public UserDetails getDetailsByRegid(long regid);

}
