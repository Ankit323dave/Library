package org.library.service;

import java.util.List;

import org.library.model.User;

public interface UserService {
	
	public void saveUser(User user);

	public List<User> listUsers();

	public User getUser(Long id);

	public void deleteUser(Long id);

}
