package com.mongodbonline.mongodbonline;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
 
@Document(collection = "users")
 
public class User {
    @Id
    int id;
    String name;
    String age;
 
    public User(int id,String name, String age) {
    	this.id=id;
        this.name = name;
        this.age = age;
    }
 
    public String getAge() {
        return age;
    }
 
    public void setAge(String age) {
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
    

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}