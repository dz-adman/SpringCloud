package com.ad.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerScApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerScApplication.class, args);
	}

}
