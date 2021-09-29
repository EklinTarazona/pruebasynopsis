package com.evalfinal.tiendaonline.enumeration;

import com.evalfinal.tiendaonline.response.PruebaResponse;
import com.evalfinal.tiendaonline.response.StatusResponse;
import lombok.Getter;

@Getter
public enum PruebaStatusEnum {
	
	OK("0000", "Ejecutado con éxito"),
	DATO_EXIST("9000", "Los datos ingresados ya han sido registrados previamente"),
	DATO_NOT_EXIST("9001", "No existen registros previos de los datos ingresados"),
	ERROR_GENERIC("9002", "Error genérico");
	
	private final StatusResponse status;
	
	PruebaStatusEnum(String code, String msg){
		status = new StatusResponse(code, msg);
	}
	public <T> PruebaResponse<T> createResponse(Class<T> clazz){
		return new PruebaResponse<T>(getStatus());
	}
	
}
