package com.cristianoxc.dsvendas.dto;

import com.cristianoxc.dsvendas.entities.Seller;

public class SaleSumDTO {
	
	private String sallerName;
	private Double sum;
	
	public SaleSumDTO() {
	}

	// tem que passar o Saller no contrutor para ser usado no postgree
	// ele nao aceita se passar agrupar se passar somente o sallerName
	public SaleSumDTO(Seller seller, Double sum) {
		this.sallerName = seller.getName();
		this.sum = sum;
	}

	public String getSallerName() {
		return sallerName;
	}

	public void setSallerName(String sallerName) {
		this.sallerName = sallerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
