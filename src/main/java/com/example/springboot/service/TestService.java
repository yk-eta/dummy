package com.example.springboot.service;

import com.example.springboot.dto.TestDto;
import com.example.springboot.mapper.TestMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private final TestMapper mapper;

    public TestService(TestMapper mapper) {
        this.mapper = mapper;
    }

    public List<TestDto> list() {
        return mapper.list();
    }

    public TestDto get(int id) {
        return mapper.get(id);
    }

    public int create(TestDto data) {
        return mapper.create(data.text);
    }

    public int update(int id, TestDto data) {
        return mapper.update(id, data.text);
    }

    public int delete(int id) {
        return mapper.delete(id);
    }
}
