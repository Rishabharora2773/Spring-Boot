package com.springboot.tutorial.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springboot.tutorial.dao.UserDao;


@Service
public class UserService {
	@Resource
	private UserDao userDao;
	
	public String getUser() {
		return userDao.getUser();
	}
}
