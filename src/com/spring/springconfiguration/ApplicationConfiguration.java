package com.spring.springconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	 @Bean(name="country")
	 public Country getCountry()
	 {
	  return new Country("India");
	 }

}
