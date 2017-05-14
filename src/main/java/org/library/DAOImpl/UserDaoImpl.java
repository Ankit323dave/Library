package org.library.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.library.DAO.UserDao;
import org.library.model.Books;
import org.library.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionfactory;
	
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		getSession().merge(user);
	}

	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return getSession().createCriteria(User.class).list();
	}
	

	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return (User) getSession().get(User.class, id);
		
	}

	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		User user = getUser(id);
		if(user!=null){
			getSession().delete(user);
		}
		
	}
	
	private Session getSession() {
        Session sess = getSessionFactory().getCurrentSession();
        if (sess == null) {
               sess = getSessionFactory().openSession();
        }
        return sess;    
 }
	private SessionFactory getSessionFactory() {
        return sessionfactory;
 }

}
