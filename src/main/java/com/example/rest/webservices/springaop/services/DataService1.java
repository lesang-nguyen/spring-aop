package com.example.rest.webservices.springaop.services;

import org.springframework.stereotype.Service;

@Service
public class DataService1 {
    public DataService1() {
    }
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
