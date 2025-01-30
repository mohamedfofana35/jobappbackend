package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.methery.model.JobPost;
import com.methery.service.JobPostService;

@SpringBootApplication
@EntityScan( "com.methery.model")
@ComponentScan(basePackages = "com.methery")
@EnableJpaRepositories("com.methery.repository")
public class JobAppApplication {
    public static void main(String[] args) {
    SpringApplication.run(JobAppApplication.class, args);
    	 
  // context.getBean(JobPostService.class);
//    	JobPost post = context.getBean(JobPost.class); 
//    	service.getAllJobPosts();
    	
    }
}
