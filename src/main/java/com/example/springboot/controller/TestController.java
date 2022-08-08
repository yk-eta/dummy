package com.example.springboot.controller;

import com.example.springboot.dto.TestDto;
import com.example.springboot.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("test")
@RestController
public class TestController {

	private final TestService service;

	public TestController(TestService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<TestDto>> list() {
		return new ResponseEntity<>(service.list(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<TestDto> get(@PathVariable int id) {
		return new ResponseEntity<>(service.get(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Integer> create(@Valid @RequestBody TestDto dto) {
		return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
	}

	@PostMapping("/{id}")
	public ResponseEntity<Integer> update(@Valid @RequestBody TestDto dto, @PathVariable int id) {
		return new ResponseEntity<>(service.update(id, dto), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> delete(@PathVariable int id) {
		return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
	}

}
