package com.abhijit.microservices.currencyconversionservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private double conversionMultiple;
	private double quantity;
	private double totalCalculatedAmount;
	private int port;
	
	public CurrencyConversionBean(){}

	public CurrencyConversionBean(Long id, String from, String to, double conversionMultiple, double quantity,
			double totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	};
	
	
	
	
}
