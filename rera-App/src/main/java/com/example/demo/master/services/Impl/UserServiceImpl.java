package com.example.demo.master.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.master.dao.UserDao;
import com.example.demo.master.model.User1;
import com.example.demo.master.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	@Override
	public List<User1> getAllUsers() {
		List<User1> l=new ArrayList<User1>();
		userdao.findAll().iterator().forEachRemaining(l::add);
		return l;
	}

	
	
}
