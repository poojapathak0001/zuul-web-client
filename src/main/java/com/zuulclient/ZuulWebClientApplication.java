package com.zuulclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ZuulWebClientApplication  extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZuulWebClientApplication.class);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
}
