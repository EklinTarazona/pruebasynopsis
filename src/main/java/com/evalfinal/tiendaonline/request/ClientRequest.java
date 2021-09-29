package com.evalfinal.tiendaonline.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {
	private Long clientId;
	private String name;
	private String numDoc;
	private String numCel;
	private String role;
	private String word;
}
