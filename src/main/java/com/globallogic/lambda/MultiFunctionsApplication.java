package com.globallogic.lambda;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MultiFunctionsApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MultiFunctionsApplication.class, args);
	}

	@Bean // POST
	public Function<String, String> uppercase() {
		return value -> value.toUpperCase();
	}

	@Bean // POST
	public Function<String, Integer> length() {
		return value -> value.length();
	}

	@Bean // GET
	public Supplier<String> example() {
		return () -> "Hello, the time is " + new Date();
	}
}
