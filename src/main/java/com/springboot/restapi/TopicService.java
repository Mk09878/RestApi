package com.springboot.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService  {

    private final TopicRepository topicRepository;

    private List<Topic> topics;
    public TopicService(TopicRepository topicRepository) {
        this.topics = new ArrayList<>(Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        ));
        this.topicRepository = topicRepository;
    }

    public List<Topic> getTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Topic updated_topic){
        topicRepository.save(updated_topic); // Checks if id is present, if yes then updates the row
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
