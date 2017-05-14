package org.library.serviceImpl;

import java.util.List;

import org.library.DAO.UserDao;
import org.library.model.User;
import org.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServImpl implements UserService{

	@Autowired
	UserDao userdao;
	
	@Transactional
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userdao.saveUser(user);
	}

	@Transactional
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return userdao.listUsers();
	}

	@Transactional
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userdao.getUser(id);
	}

	@Transactional
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userdao.deleteUser(id);
	}

}
