package com.ad.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Service3ScApplication {

	public static void main(String[] args) {
		SpringApplication.run(Service3ScApplication.class, args);
	}

}
