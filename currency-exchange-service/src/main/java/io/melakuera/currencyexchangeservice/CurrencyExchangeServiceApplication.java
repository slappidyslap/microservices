package io.melakuera.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner(CurrencyExchangeRepo currencyExchangeRepo) {
		
		return args -> {
			
			currencyExchangeRepo.save(new CurrencyExchange(
					10001L, "USD", "KGS", BigDecimal.valueOf(84.0), ""));
			currencyExchangeRepo.save(new CurrencyExchange(
					10002L, "RUB", "KGS", BigDecimal.valueOf(1.2), ""));
			currencyExchangeRepo.save(new CurrencyExchange(
					10003L, "KZT", "KGS", BigDecimal.valueOf(0.18), ""));
		};
	}

}
