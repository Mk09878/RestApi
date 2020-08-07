package com.springboot.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    /**
     * Creates a list of Topic objects. Spring Boot automatically converts the return type into JSON objects.
     * The generated JSON has key names corresponding to instance variables of the Topic class
     * and the JSON values are the values of those variables.
     * @return list of Topic objects
     */
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{foo}")
    public Topic getTopic(@PathVariable("foo") String id){ // If name of variable in RequestMapping and PathVariable is different
        return topicService.getTopic(id);
    }


}
