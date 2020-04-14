package com.microservice.callerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallerRestController {
    
	private RestTemplate restTemplate;
 
    @Autowired
    public CallerRestController() {
        this.restTemplate = new RestTemplate();
    }
    
    @GetMapping("/callerservice")
    public String callReceiverService() {
        String endpoint = "http://echoservice:8280/echo";
        return restTemplate.getForObject(endpoint, String.class);
    }
}
