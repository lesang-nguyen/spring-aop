package com.example.rest.webservices.springaop.services.bussiness;

import com.example.rest.webservices.springaop.services.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService2 {
    private DataService1 dataService1;

    public BusinessService2(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    public int calculateMin() {
        int[] data = dataService1.retrieveData2();
        return Arrays.stream(data).min().orElse(0);
    }
}
