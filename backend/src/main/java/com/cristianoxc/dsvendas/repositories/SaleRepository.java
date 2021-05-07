package com.cristianoxc.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianoxc.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
