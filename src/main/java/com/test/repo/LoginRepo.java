package com.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.admin.Admin;
@Repository

public interface LoginRepo extends JpaRepository<Admin,Integer> {
	
	// @Query("SELECT u.username, u.password FROM ADMIN_TABLE u WHERE u.username = :username && u.password= :password")
	  Admin findByUsernameAndPassword(String username, String password);

	    
}
