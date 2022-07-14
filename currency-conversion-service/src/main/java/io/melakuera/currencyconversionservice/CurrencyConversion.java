package io.melakuera.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversion {
	
	private Long currencyConversionId;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totolCalculatedAmout;
	private String environment;
	
	public CurrencyConversion() {}
	
	public CurrencyConversion(
			Long currencyConversionId, 
			String from, 
			String to, 
			BigDecimal quantity,
			BigDecimal conversionMultiple,
			BigDecimal totolCalculatedAmout, 
			String environment) {
		super();
		this.currencyConversionId = currencyConversionId;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totolCalculatedAmout = totolCalculatedAmout;
		this.environment = environment;
	}

	public Long getCurrencyConversionId() {
		return currencyConversionId;
	}

	public void setCurrencyConversionId(Long currencyConversionId) {
		this.currencyConversionId = currencyConversionId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotolCalculatedAmout() {
		return totolCalculatedAmout;
	}

	public void setTotolCalculatedAmout(BigDecimal totolCalculatedAmout) {
		this.totolCalculatedAmout = totolCalculatedAmout;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
}
