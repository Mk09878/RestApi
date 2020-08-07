package com.springboot.restapi;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private final List<Topic> topics;
    public TopicService() {
        this.topics = Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );
    }

    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String id) {
        for (Topic topic : topics) {
            if (topic.getId().equals(id))
                return topic;
        }
        return new Topic("Null","Null","Topic not found");
    }
}
