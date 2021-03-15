package com.abhijit.microservices.currencyexchangeservice;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeValue {
	private long id;
	private String from;
	private String to;
	private double conversionMultiple;
	private int port;
	public ExchangeValue() {
		
	}
	public ExchangeValue(long id, String from, String to, double d) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = d;
	}
	
}
