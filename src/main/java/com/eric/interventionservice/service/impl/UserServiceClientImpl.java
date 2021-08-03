package com.eric.interventionservice.service.impl;

import com.eric.interventionservice.service.UserServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class UserServiceClientImpl implements UserServiceClient {
    @Autowired
    private RestTemplate restTemplate;

    public void getUserByUserName(String userName) {
        ResponseEntity<String> responseEntity = restTemplate.exchange("http://userservice/users/{userName}",
                HttpMethod.GET, null, String.class, userName);
        log.info(responseEntity.getBody());
    }
}
