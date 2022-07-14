package io.melakuera.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExcangeController {

	@Autowired
	private Environment env;
	
	@Autowired
	private CurrencyExchangeRepo currencyExchangeRepo;
	
	@GetMapping("/currency-exchange/exchange")
	CurrencyExchange getExchange(
			@RequestParam("from") String from, 
			@RequestParam("to") String to) {
		
		var currencyExchange = currencyExchangeRepo.findByFromAndTo(from, to);
		
		if (currencyExchange == null) {
			throw new RuntimeException("Not found");
		}
		
		currencyExchange.setEnvironment(env.getProperty("server.port"));
		
		return currencyExchange;
	}
}
