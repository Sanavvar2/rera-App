package com.example.demo.master.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.master.model.User1;

@Repository
public interface UserDao extends CrudRepository<User1, Long>  {

	  
	
}
