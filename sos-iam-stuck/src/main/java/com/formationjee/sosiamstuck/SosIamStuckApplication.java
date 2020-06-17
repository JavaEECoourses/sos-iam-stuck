package com.formationjee.sosiamstuck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan
public class SosIamStuckApplication {

	public static void main(String[] args) {

		SpringApplication.run(SosIamStuckApplication.class, args);

	}

}
