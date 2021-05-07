package com.cristianoxc.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristianoxc.dsvendas.dto.SellerDTO;
import com.cristianoxc.dsvendas.entities.Seller;
import com.cristianoxc.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
		//convert a lista de Seller em lista de SellerDTO
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
