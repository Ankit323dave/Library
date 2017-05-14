package org.library.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.library.DAO.BookDao;
import org.library.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{

	@Autowired
	private SessionFactory sessionfactory;
	


	public void saveBook(Books book) {
		// TODO Auto-generated method stub
		getSession().merge(book);
	}

	public List<Books> listBooks() {
		// TODO Auto-generated method stub
		return getSession().createCriteria(Books.class).list();
	}

	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		Books book = getBook(id);
		if(book!=null){
			 getSession().delete(book);
		}
		
	}

	public Books getBook(Long id) {
		// TODO Auto-generated method stub
		return (Books) getSession().get(Books.class, id);
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
