package com.microservice.echoservice;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoRestController {

	@GetMapping("/echo")
    public String echo() {
        return "Hello! This is a message sent by echoservice to callerservice. \n"
        		+ "Info: " +  
                LocalDateTime.now() + "\n" + 
                this.toString();
    }
}