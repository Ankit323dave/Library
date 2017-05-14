package org.library.serviceImpl;

import java.util.List;

import org.library.DAO.BookDao;
import org.library.model.Books;
import org.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServImpl implements BookService{

	@Autowired
	private BookDao bookdao;
	
	@Transactional
	public void saveBook(Books book) {
		// TODO Auto-generated method stub
		bookdao.saveBook(book);
		
	}
	
	@Transactional
	public List<Books> listBooks() {
		// TODO Auto-generated method stub
		return bookdao.listBooks();
	}

	@Transactional
	public Books getBook(Long id) {
		// TODO Auto-generated method stub
		return bookdao.getBook(id);
	}

	@Transactional
	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		bookdao.deleteBook(id);
	}

}
