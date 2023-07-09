package com.zeeshan.apigw.apigwservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class ApigwServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigwServiceApplication.class, args);
	}

	@Bean
	public KeyResolver keyResolver(){
		return  exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());

	}

}
