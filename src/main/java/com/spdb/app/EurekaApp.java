package com.spdb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApp {
	public static void main(String[] args) {
		
		System.out.println("可以提交上去吗？");   
		
		SpringApplication.run(EurekaApp.class, args);
	}
}
