package com.cristianoxc.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cristianoxc.dsvendas.dto.SaleDTO;
import com.cristianoxc.dsvendas.dto.SaleSuccessDTO;
import com.cristianoxc.dsvendas.dto.SaleSumDTO;
import com.cristianoxc.dsvendas.entities.Sale;
import com.cristianoxc.dsvendas.repositories.SaleRepository;
import com.cristianoxc.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		//Evita várias consultas na table seller, so funciona quando são poucos registros
		//achei isso um recurso tecnico, pesquisar depois melhor solução
		sellerRepository.findAll();
		
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupdBySeller(){
		return repository.amountGroupdBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> succesGroupdBySeller(){
		return repository.succesGroupdBySeller();
	}
}
