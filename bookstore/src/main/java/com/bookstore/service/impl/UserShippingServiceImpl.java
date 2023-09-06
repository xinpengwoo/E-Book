package com.bookstore.service.impl;

import com.bookstore.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.UserShipping;
import com.bookstore.repository.UserShippingRepository;
import com.bookstore.service.UserShippingService;

import java.util.Optional;

@Service
public class UserShippingServiceImpl implements UserShippingService{
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	
	public UserShipping findById(Long id) {
		Optional<UserShipping> usershipping = userShippingRepository.findById(id);
		UserShipping value = usershipping.orElseThrow(() ->
				new RuntimeException("No such user shipping found"));
		return value;
	}
	
	public void removeById(Long id) {
		userShippingRepository.deleteById(id);

	}

}
