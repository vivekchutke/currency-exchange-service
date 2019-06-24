package com.vivekchutke.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	//@GeneratedValue
	private long id;
	@Column(name="from_currency")
	private String from;
	@Column(name="to_currency")
	private String to;
	private BigDecimal conversitionValue;
	private int portNumber; 
	
	public int getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	public ExchangeValue(long id, String from, String to, BigDecimal conversitionValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversitionValue = conversitionValue;
	}
	public ExchangeValue() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public BigDecimal getConversitionValue() {
		return conversitionValue;
	}
	public void setConversitionValue(BigDecimal conversitionValue) {
		this.conversitionValue = conversitionValue;
	}
	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + "]";
	}
}
