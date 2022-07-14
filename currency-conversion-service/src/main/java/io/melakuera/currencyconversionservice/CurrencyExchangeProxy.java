package io.melakuera.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/exchange")
	CurrencyConversion getExchange(
			@RequestParam("from") String from, 
			@RequestParam("to") String to);

}
