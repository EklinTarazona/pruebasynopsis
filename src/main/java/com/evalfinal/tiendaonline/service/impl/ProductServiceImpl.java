package com.evalfinal.tiendaonline.service.impl;

import com.evalfinal.tiendaonline.converter.ProductRequestToModel;
import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Product;
import com.evalfinal.tiendaonline.repository.ProductRepository;
import com.evalfinal.tiendaonline.request.ProductDelRequest;
import com.evalfinal.tiendaonline.request.ProductRequest;
import com.evalfinal.tiendaonline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private ProductRequestToModel productRequestConverter;
	
	@Override
	public void add(ProductRequest product) throws PruebaException {
		Product productModel = productRequestConverter.convert(product);
		repository.add(productModel);
	}
	
	@Override
	public void edit(ProductRequest product) throws PruebaException {
		Product productModel = productRequestConverter.convert(product);
		repository.edit(productModel);
	}
	
	@Override
	public void remove(ProductDelRequest productId) {
		repository.remove(productId.getProductId());
	}
	
	@Override
	public List<Product> list() {
		return repository.list();
	}
}
