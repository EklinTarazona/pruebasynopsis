package com.evalfinal.tiendaonline.advice;

import com.evalfinal.tiendaonline.enumeration.PruebaStatusEnum;
import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.response.PruebaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PruebaAdvice {
	
	@ExceptionHandler({PruebaException.class})
	public ResponseEntity<PruebaResponse<?>> pruebaException(PruebaException e){
		PruebaResponse<?> response = e.getStatus().createResponse(Object.class);
		return ResponseEntity.internalServerError().body(response);
	}
	
	@ExceptionHandler
	public ResponseEntity<PruebaResponse<?>> generalException(Exception e){
		PruebaResponse<?> response = PruebaStatusEnum.ERROR_GENERIC.createResponse(Object.class);
		return ResponseEntity.internalServerError().body(response);
	}
}
