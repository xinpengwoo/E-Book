package com.bookstore.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.Book;
import com.bookstore.repository.BookRepository;
import com.bookstore.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;

	public List<Book> findAll() {
		List<Book> bookList = (List<Book>) bookRepository.findAll();
		List<Book> activeBookList = new ArrayList<>();

		for (Book book: bookList) {
			if(book.isActive()) {
				activeBookList.add(book);
			}
		}

		return activeBookList;
	}
	
	public Book findOne(Long id) {
		Optional<Book> book = bookRepository.findById(id);
		Book value = book.orElseThrow(() ->
				new RuntimeException("No such book found"));
		return value;
	}

	public List<Book> findByCategory(String category){
		List<Book> bookList = bookRepository.findByCategory(category);

		List<Book> activeBookList = new ArrayList<>();

		for (Book book: bookList) {
			if(book.isActive()) {
				activeBookList.add(book);
			}
		}

		return activeBookList;
	}

	public List<Book> blurrySearch(String title) {
		List<Book> bookList = bookRepository.findByTitleContaining(title);
		List<Book> activeBookList = new ArrayList<>();

		for (Book book: bookList) {
			if(book.isActive()) {
				activeBookList.add(book);
			}
		}

		return activeBookList;
	}

}
