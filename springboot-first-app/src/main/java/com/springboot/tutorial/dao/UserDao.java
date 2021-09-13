package com.springboot.tutorial.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public String getUser() {
		// I/O operation => fetching user from database
		return "Rishab";
	}
}
