package com.soham.jdbc.service;

import com.soham.jdbc.model.Book;

public interface BookService {
	public Book saveBook(Book book);
	public Book findByBookId(int bookId);

}
