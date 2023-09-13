package com.nissan.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.common.APIResponse;
import com.nissan.dto.EmployeeDeptDTO;
import com.nissan.util.JwtUtil;

@RestController // Controller+@Configuration
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private APIResponse apiResponse;

	@Autowired
	private ICustomerService customerService;

	@Autowired
	JwtUtil jwtUtil;
