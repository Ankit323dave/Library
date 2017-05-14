package org.library.service;

import java.util.List;

import org.library.model.Books;

public interface BookService {
	
public void saveBook(Books book);

public List<Books> listBooks();

public Books getBook(Long id);

public void deleteBook(Long id);
}
