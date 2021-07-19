package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
@EnableEurekaClient
@SpringBootApplication
public class AuthorServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorServiceClientApplication.class, args);
	}
	@Bean
	@LoadBalanced //makes the client to use servicId instead of absolute URL
	  public WebClient.Builder builder(){
		 return WebClient.builder();
	}
	  @Bean
	   public WebClient client(WebClient.Builder builder) {
		  return builder.build();
	  }
	

}
