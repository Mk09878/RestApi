package com.springboot.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // In order to mark the class as a rest controller. Meaning there will be methods in this class which map to URL requests
public class HelloController {

    @RequestMapping("/hello") // Maps only to the GET method by default. To map to other HTTP methods, those have to be specified in the annotation
    public String sayHi(){
        return "Hi!";
    }
}
