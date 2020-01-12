package com.example.demo;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Service {

    public String run() {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> r = rt.exchange("http://192.168.99.101:30001/test", HttpMethod.GET, new HttpEntity<>(null,null),String.class);
        return  r.getBody();
    }
}
