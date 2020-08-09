package com.springboot.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * @return List of Topic objects
     */
    @RequestMapping("/topics") // No need to specify GET request since, the default is GET
    public List<Topic> getAllTopics(){
        return topicService.getTopics();
    }

    //@RequestMapping("/topics/{foo}")
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){ // If name of variable in RequestMapping and PathVariable is different then public Topic getTopic(@PathVariable("foo") String id)
        return topicService.getTopic(id);
    }

    /**
     * Tells spring that the request payload will contain a JSON representation of the Topic instance.
     * So, take the RequestBody and convert it to a Topic instance and pass it to addTopic when URL is mapped.
     * @param topic Instance of Topic class
     */
    @RequestMapping(method = RequestMethod.POST, value = "/topics") // To specify POST request
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}") // To specify POST request
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
        topicService.updateTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){ // If name of variable in RequestMapping and PathVariable is different then public Topic getTopic(@PathVariable("foo") String id)
        topicService.deleteTopic(id);
    }

}
