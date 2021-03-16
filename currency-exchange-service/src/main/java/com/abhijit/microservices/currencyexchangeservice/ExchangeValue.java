package com.abhijit.microservices.currencyexchangeservice;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ExchangeValue {
	@Id
	private long id;
	
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
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
