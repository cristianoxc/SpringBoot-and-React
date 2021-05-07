package com.cristianoxc.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cristianoxc.dsvendas.dto.SaleSuccessDTO;
import com.cristianoxc.dsvendas.dto.SaleSumDTO;
import com.cristianoxc.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.cristianoxc.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale as obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupdBySeller();
	
	@Query("SELECT new com.cristianoxc.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale as obj GROUP BY obj.seller")
	List<SaleSuccessDTO> succesGroupdBySeller();
}
