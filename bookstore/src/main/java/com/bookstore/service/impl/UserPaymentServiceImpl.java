package com.bookstore.service.impl;

import com.bookstore.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.UserPayment;
import com.bookstore.repository.UserPaymentRepository;
import com.bookstore.service.UserPaymentService;

import java.util.Optional;

@Service
public class UserPaymentServiceImpl implements UserPaymentService{

	@Autowired
	private UserPaymentRepository userPaymentRepository;
		
	public UserPayment findById(Long id) {
		Optional<UserPayment> userpayment = userPaymentRepository.findById(id);
		UserPayment value = userpayment.orElseThrow(() ->
				new RuntimeException("No such user payment found"));
		return value;
	}

	public void removeById(Long id) {
		userPaymentRepository.deleteById(id);
	}
} 
