package com.majustic.formation.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.majustic.formation.demo.dto.MetricDTO;
import com.majustic.formation.demo.repository.AddressRepository;
import com.majustic.formation.demo.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	AddressRepository addressRepository;
	
	@GetMapping("/metrics")
	MetricDTO getMetrics() {
		MetricDTO metric = new MetricDTO();
		metric.setNbUsersWithoutAddress(userRepository.nbUsersWithoutAddress());
		metric.setNbUsersWithAddress(userRepository.nbUsersWithAddress());
		metric.setNbAddWithoutUser(addressRepository.nbAddWithoutUser());
		metric.setNbAddLeastOneUser(addressRepository.nbAddWithUser());
		return metric;
	}

}
