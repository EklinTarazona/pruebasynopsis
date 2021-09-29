package com.evalfinal.tiendaonline.service.impl;

import com.evalfinal.tiendaonline.response.IndexResponse;
import com.evalfinal.tiendaonline.service.PruebaService;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Service
public class PruebaServiceImpl implements PruebaService {
	
	@Override
	public IndexResponse index() {
		System.out.println("Mensaje de Index en cmd XD");
		return IndexResponse.builder().message("invocando Intex en navegador").build();
	}
}
