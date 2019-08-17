package com.microservicios2.clase4.accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountServiceDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceDockerApplication.class, args);
	}

}
