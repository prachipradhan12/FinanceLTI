package com.fianance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fianance.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public User findUserByUname(String uname);
}
