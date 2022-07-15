package com.moura.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moura.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	
}
