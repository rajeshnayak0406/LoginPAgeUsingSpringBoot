package com.test.admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ADMIN_TABLE")
public class Admin {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  @Column(name = "USERNAME")
  String username;
  
  @Column(name = "PASSWORD")
  String password;

}
