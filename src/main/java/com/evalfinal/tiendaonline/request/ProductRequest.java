package com.evalfinal.tiendaonline.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
	private Long productId;
	private String namePr;
	private String codPr;
	private String pricePr;
}
