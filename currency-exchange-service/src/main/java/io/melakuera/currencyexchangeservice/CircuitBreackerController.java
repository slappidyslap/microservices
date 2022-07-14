package io.melakuera.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;

@RestController
public class CircuitBreackerController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/test")
//	@Retry(name = "sample-api", fallbackMethod = "fallbackMethod")
//	@CircuitBreaker(name = "default", fallbackMethod = "fallbackMethod")
//	@RateLimiter(name = "default")
	@Bulkhead(name = "default")
	String test() {
		
		logger.error("test");
		
//		ResponseEntity<String> entity = new RestTemplate().getForEntity(
//				"http://localhost:8081/some-url", String.class);
//		
//		return entity.getBody();
		
		return "test";
	}
	
	public String fallbackMethod(Exception e) {
		return "this is fallback method!";
	}
}
