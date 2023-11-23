package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Object data;
    private Boolean success;
    private String failMessage;
}
