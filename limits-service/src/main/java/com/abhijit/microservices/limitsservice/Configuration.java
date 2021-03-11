package com.abhijit.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("limits-service")
@Component
@Getter
@Setter
public class Configuration {
	private int minimum;
	private int maximum;
}
