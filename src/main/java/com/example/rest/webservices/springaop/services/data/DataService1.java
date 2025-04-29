package com.example.rest.webservices.springaop.services.data;

import org.springframework.stereotype.Service;

@Service
public class DataService1 {
    public DataService1() {
    }
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
    public int[] retrieveData2() {
        return new int[]{111, 2222, 3111, 43333, 5333};
    }

}
