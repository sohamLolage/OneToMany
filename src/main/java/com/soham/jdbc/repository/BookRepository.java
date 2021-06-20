package com.soham.jdbc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soham.jdbc.model.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
	public Book findByBookId(int bookId);
}
