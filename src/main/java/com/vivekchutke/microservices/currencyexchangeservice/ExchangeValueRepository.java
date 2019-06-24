package com.vivekchutke.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	
	//Also try findByFromOrTo()
	
	ExchangeValue findByFromAndTo(String from, String to);

}
