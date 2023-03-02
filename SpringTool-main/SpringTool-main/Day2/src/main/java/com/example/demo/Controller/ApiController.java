package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
        @Value("Hello!!!")
        private String stringValue;
        
        @Value("$[sample.value]")  
        private String javaHome;
        
        @GetMapping("/")
        public String sayHello() {
        	return stringValue+javaHome;
        }

}
