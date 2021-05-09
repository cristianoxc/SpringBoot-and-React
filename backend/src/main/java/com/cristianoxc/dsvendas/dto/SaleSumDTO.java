package com.cristianoxc.dsvendas.dto;

import com.cristianoxc.dsvendas.entities.Seller;

public class SaleSumDTO {
	
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {
	}

	// tem que passar o Seller no contrutor para ser usado no postgree
	// ele nao aceita se passar agrupar se passar somente o sallerName
	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
