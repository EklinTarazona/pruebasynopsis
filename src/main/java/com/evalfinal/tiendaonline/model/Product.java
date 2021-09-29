package com.evalfinal.tiendaonline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	private Long productId;
	private String namePr;
	private String codPr;
	private String pricePr;
	//Nombre, Codigo, Precio
	
}
