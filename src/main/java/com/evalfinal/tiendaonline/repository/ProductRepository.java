package com.evalfinal.tiendaonline.repository;

import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductRepository {
	
	public void add(Product product) throws PruebaException;
	public void edit(Product product) throws PruebaException;
	public void remove(Long productId);
	public List<Product> list();
	
}
