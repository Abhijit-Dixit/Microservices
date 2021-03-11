package com.abhijit.microservices.limitsservice.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LimitConfiguration {
	private int maximum;
	private int minimum;
	protected LimitConfiguration() {
		
	}
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
}
