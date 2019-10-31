package in.gov.master.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.gov.master.dao.UserDao;
import in.gov.master.model.User1;
import in.gov.master.services.UserService;

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
