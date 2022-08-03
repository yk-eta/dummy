package com.example.springboot.controller;

import com.example.springboot.dto.TestDto;
import com.example.springboot.service.TestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("test")
@RestController
public class TestController {

	private final TestService service;

	public TestController(TestService service) {
		this.service = service;
	}

	@GetMapping
	public List<TestDto> list() {
		return service.list();
	}

	@GetMapping("/{id}")
	public TestDto get(@PathVariable int id) {
		return service.get(id);
	}

	@PostMapping
	public int create(@RequestBody TestDto dto) {
		return service.create(dto);
	}

	@PostMapping("/{id}")
	public int update(@RequestBody TestDto dto, @PathVariable int id) {
		return service.update(id, dto);
	}

	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return service.delete(id);
	}

}
