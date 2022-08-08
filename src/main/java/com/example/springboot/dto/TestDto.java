package com.example.springboot.dto;

import javax.validation.constraints.NotEmpty;

public class TestDto {

    public int id;

    @NotEmpty(message = "text is required.")
    public String text;
}
