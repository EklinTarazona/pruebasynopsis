package com.evalfinal.tiendaonline.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PruebaResponse <T>{
	private StatusResponse status;
	private T data;
	
	public PruebaResponse(StatusResponse status){
		this.setStatus(status);
	}
}
