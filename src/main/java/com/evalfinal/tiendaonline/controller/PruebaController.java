package com.evalfinal.tiendaonline.controller;


import com.evalfinal.tiendaonline.response.IndexResponse;
import com.evalfinal.tiendaonline.response.PruebaResponse;
import com.evalfinal.tiendaonline.response.StatusResponse;
import com.evalfinal.tiendaonline.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba/v1")
public class PruebaController {
	
	@Autowired
	private PruebaService service;
	
	@GetMapping({"/", ""})
	public PruebaResponse<IndexResponse> index(){
		PruebaResponse<IndexResponse> response = new PruebaResponse<>();
		response.setData(service.index());
		response.setStatus(StatusResponse.builder().code("222").message("Exito").build());
		return response;
	}
	
}
