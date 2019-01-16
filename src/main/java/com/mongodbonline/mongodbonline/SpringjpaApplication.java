package com.mongodbonline.mongodbonline;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
 
import java.util.List;
 
@SpringBootApplication
public class SpringjpaApplication {
 
	@Autowired
	UserRepository userRepository;
 
	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}
 
 
	@Bean
	CommandLineRunner runner(){
		return args -> {
 
			System.out.print("<<<<<<<<<<<<<Cleaning MongoDatabase>>>>>>>>>>>>>>");
			userRepository.deleteAll();
 
			/*for(int i=0;i<5;i++){
				User user=	userRepository.save(new User(i,"Test",String.valueOf(i+12)));
				
 
				System.out.println("<<<<<<<<<<<<<Adding User >>>>>>>>>>>>>>");
				System.out.println("***"+user.toString()+"***");
			}*/
			
			User user=userRepository.insert(new User(7,"Hello","12"));
			userRepository.insert(new User(8,"Bye","13"));
			userRepository.insert(new User(9,"ByeBye","14"));
			userRepository.insert(new User(10,"Nalini","15"));
			
 
			System.out.println("<<<<<<<<<<<<<Get All  User >>>>>>>>>>>>>>");
			List<User> alluser=userRepository.findAll();
			alluser.forEach(item -> System.out.println(item));
 
			alluser.clear();
 
			System.out.println("<<<<<<<<<<<<<Find User By Name >>>>>>>>>>>>>>");
		    alluser=userRepository.findByName("Test");
			alluser.forEach(item -> System.out.println(item));
 
			System.out.println("Executed");
			
			
 
		};
	}
}