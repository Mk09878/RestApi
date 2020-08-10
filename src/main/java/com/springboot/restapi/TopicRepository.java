package com.springboot.restapi;

import org.springframework.data.repository.CrudRepository;

// Spring has a CrudRepository which consists of predefined methods to perform CRUD operations. So we can define an interface and make it extend the CrudRepository interface.
// The CrudRepository requires a generic type argument. So, the first argument specifies the class whose objects will be operated upon and the second argument specifies the datatype of the primary key
public interface TopicRepository extends CrudRepository<Topic, String> {
}
