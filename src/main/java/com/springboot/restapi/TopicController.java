package com.springboot.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    /**
     * Creates a list of Topic objects. Spring Boot automatically converts the return type into JSON objects.
     * The generated JSON has key names corresponding to instance variables of the Topic class
     * and the JSON values are the values of those variables.
     * @return list of Topic objects
     */
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );
    }
}
