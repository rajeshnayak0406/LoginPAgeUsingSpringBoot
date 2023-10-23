package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.admin.Admin;
import com.test.repo.LoginRepo;

@Service
public class LoginService {

    
    @Autowired
    private LoginRepo repo;
    
    
    public Admin login(String username,String password) {
    	
    	
    	
    	
    	Admin admin=repo.findByUsernameAndPassword(username, password);
    	return admin;
    }
    
    
    
    
    
    
}
