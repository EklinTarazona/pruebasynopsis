package com.evalfinal.tiendaonline.controller;

import com.evalfinal.tiendaonline.enumeration.PruebaStatusEnum;
import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Client;
import com.evalfinal.tiendaonline.request.ClientDelRequest;
import com.evalfinal.tiendaonline.request.ClientRequest;
import com.evalfinal.tiendaonline.response.PruebaResponse;
import com.evalfinal.tiendaonline.service.ClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableWebSecurity
@RestController
@RequestMapping({"/client"})
public class ClientController {
	
	public static final Logger logger = LogManager.getLogger();

	@Autowired
	private ClientService service;
	
	
	protected void configure(HttpSecurity http) throws Exception {
		http       //other configure params.
			.csrf().disable();
	}
	
	@PostMapping
	public PruebaResponse<?> add(@RequestBody ClientRequest beanClReq) throws PruebaException {
		if(logger.isInfoEnabled()){
			logger.info("Ingreso a método add");
			logger.info("Ingreso a método add");
			logger.info("Ingreso a método add");
		}
		service.add(beanClReq);
		PruebaResponse<?> response = PruebaStatusEnum.OK.createResponse(Object.class);
		return response;
	}
	
	@PutMapping
	
	public PruebaResponse<?> edit(@RequestBody ClientRequest beanClReq) throws PruebaException {
		if(logger.isInfoEnabled()){
			logger.info("Ingreso a método edit");
			logger.info("Ingreso a método edit");
			logger.info("Ingreso a método edit");
		}
		service.edit(beanClReq);
		PruebaResponse<?> response = PruebaStatusEnum.OK.createResponse(Object.class);
		return response;
	}
	
	@DeleteMapping
	public PruebaResponse<?> remove(@RequestBody ClientDelRequest beanClReq){
		if(logger.isWarnEnabled()){
			logger.warn("Ingreso a método delete");
			logger.warn("Ingreso a método delete");
			logger.warn("Ingreso a método delete");
			logger.warn("Ingreso a método delete");
			logger.warn("Ingreso a método delete");
		}
		service.remove(beanClReq);
		PruebaResponse<?> response = PruebaStatusEnum.OK.createResponse(Object.class);
		return response;
	}
	
	@GetMapping
	public PruebaResponse<List<Client>> list(){
		if(logger.isInfoEnabled()){
			logger.info("Ingreso a método list");
			logger.info("Ingreso a método list");
			logger.info("Ingreso a método list");
		}
		PruebaResponse<List<Client>> response = new PruebaResponse<>();
		response.setStatus(PruebaStatusEnum.OK.getStatus());
		response.setData(service.list());
		return response;
	}
}
