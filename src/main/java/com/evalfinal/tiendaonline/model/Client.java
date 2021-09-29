package com.evalfinal.tiendaonline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
	private Long clientId;
	private String name;
	private String numDoc;
	private String numCel;
	private String role = "CLIENT";
	private String word;
	//Nombre, DNI, Celular
}
