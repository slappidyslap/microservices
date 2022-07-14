package io.melakuera.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy currencyExchangeProxy;
	
	private final String baseUrl = 
			"http://localhost:8000/currency-exchange/exchange?from={from}&to={to}";

	@GetMapping("/currency-conversion/convert")
	CurrencyConversion calculateCurrencyConversion(
			@RequestParam("from") String from,
			@RequestParam("to") String to,
			@RequestParam("qtn") BigDecimal qtn) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Map<String, String> uriVar = new HashMap<>();
		uriVar.put("from", from);
		uriVar.put("to", to);
		
		var res = restTemplate.getForEntity(
				baseUrl,
				CurrencyConversion.class,
				uriVar).getBody();
		
		return new CurrencyConversion(
				100L, from, to, qtn, res.getConversionMultiple(), 
				qtn.multiply(res.getConversionMultiple()), res.getEnvironment());
	}
	
	@GetMapping("/currency-conversion-feign/convert")
	CurrencyConversion calculateCurrencyConversionFeign(
			@RequestParam("from") String from,
			@RequestParam("to") String to,
			@RequestParam("qtn") BigDecimal qtn) {
		
		
		var res = currencyExchangeProxy.getExchange(from, to);
		
		return new CurrencyConversion(
				100L, from, to, qtn, res.getConversionMultiple(), 
				qtn.multiply(res.getConversionMultiple()), res.getEnvironment());
	}
}
