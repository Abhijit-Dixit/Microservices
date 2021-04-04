package com.abhijit.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchengeController {
	private Logger logger=LoggerFactory.getLogger(this.getClass()); 
	@Autowired
	private ExchangeValueRepository repository;
	@Value("${server.port}")
	private int serverPort;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		ExchangeValue ev= repository.findByFromAndTo(from, to);
		ev.setPort(serverPort);
		logger.info("{}", ev);  
		return ev;
	}
}
