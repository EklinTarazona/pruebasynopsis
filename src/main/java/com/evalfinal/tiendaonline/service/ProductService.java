package com.evalfinal.tiendaonline.service;

import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Product;
import com.evalfinal.tiendaonline.request.ProductDelRequest;
import com.evalfinal.tiendaonline.request.ProductRequest;

import java.util.List;

public interface ProductService {
	
	public void add(ProductRequest product) throws PruebaException;
	public void edit(ProductRequest product) throws PruebaException;
	public void remove(ProductDelRequest productId);
	public List<Product> list();
}
