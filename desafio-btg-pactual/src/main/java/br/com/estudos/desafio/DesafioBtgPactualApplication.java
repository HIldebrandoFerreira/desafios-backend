package br.com.estudos.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class DesafioBtgPactualApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBtgPactualApplication.class, args);
	}

}
