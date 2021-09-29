package com.evalfinal.tiendaonline.controller;

import com.evalfinal.tiendaonline.enumeration.PruebaStatusEnum;
import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Product;
import com.evalfinal.tiendaonline.request.ProductDelRequest;
import com.evalfinal.tiendaonline.request.ProductRequest;
import com.evalfinal.tiendaonline.response.PruebaResponse;
import com.evalfinal.tiendaonline.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/product"})
public class ProductController {
	
	public static final Logger logger = LogManager.getLogger();
	
	@Autowired
	private ProductService service;
	
	@PostMapping
	public PruebaResponse<?> add(@RequestBody ProductRequest beanPrReq) throws PruebaException {
		if(logger.isInfoEnabled()){
			logger.info("Ingreso a método add");
			logger.info("Ingreso a método add");
			logger.info("Ingreso a método add");
		}
		service.add(beanPrReq);
		PruebaResponse<?> response = PruebaStatusEnum.OK.createResponse(Object.class);
		return response;
	}
	
	@PutMapping
	public PruebaResponse<?> edit(@RequestBody ProductRequest beanPrReq) throws PruebaException {
		if(logger.isInfoEnabled()){
			logger.info("Ingreso a método edit");
			logger.info("Ingreso a método edit");
			logger.info("Ingreso a método edit");
		}
		service.edit(beanPrReq);
		PruebaResponse<?> response = PruebaStatusEnum.OK.createResponse(Object.class);
		return response;
	}
	
	@DeleteMapping
	public PruebaResponse<?> remove(@RequestBody ProductDelRequest beanPrReq){
		if(logger.isWarnEnabled()){
			logger.warn("Ingreso a método delete");
			logger.warn("Ingreso a método delete");
			logger.warn("Ingreso a método delete");
			logger.warn("Ingreso a método delete");
			logger.warn("Ingreso a método delete");
		}
		service.remove(beanPrReq);
		PruebaResponse<?> response = PruebaStatusEnum.OK.createResponse(Object.class);
		return response;
	}
	
	@GetMapping
	public PruebaResponse<List<Product>> list(){
		if(logger.isInfoEnabled()){
			logger.info("Ingreso a método list");
			logger.info("Ingreso a método list");
			logger.info("Ingreso a método list");
		}
		PruebaResponse<List<Product>> response = new PruebaResponse<>();
		response.setStatus(PruebaStatusEnum.OK.getStatus());
		response.setData(service.list());
		return response;
	}
}
