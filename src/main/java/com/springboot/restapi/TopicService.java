package com.springboot.restapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics;
    public TopicService() {
        this.topics = new ArrayList<>(Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        ));
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

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(String id, Topic updated_topic){
        for(int i = 0; i < topics.size(); i++){
            if(topics.get(i).getId().equals(id)) {
                topics.set(i, updated_topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        for(int i = 0; i < topics.size(); i++){
            if(topics.get(i).getId().equals(id)){
                topics.remove(i);
                break;
            }
        }
    }
}
