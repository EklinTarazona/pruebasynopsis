package com.evalfinal.tiendaonline.exception;

import com.evalfinal.tiendaonline.enumeration.PruebaStatusEnum;
import lombok.Getter;

@Getter
public class PruebaException extends Exception{
	
	private final PruebaStatusEnum status;
	
	public PruebaException(PruebaStatusEnum status) {
		super(status.getStatus().getMessage());
		this.status = status;
	}
	
	public PruebaException(PruebaStatusEnum status, Throwable cause){
		super(status.getStatus().getMessage(), cause);
		this.status = status;
	}
}
