package com.evalfinal.tiendaonline.repository.impl;

import com.evalfinal.tiendaonline.enumeration.PruebaStatusEnum;
import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Client;
import com.evalfinal.tiendaonline.model.Product;
import com.evalfinal.tiendaonline.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	public final Map<Long, Product> data2;
	
	ProductRepositoryImpl(){
		this.data2 = new HashMap<>();
	}
	
	@Override
	public void add(Product product) throws PruebaException {
		if(this.data2.containsKey(product.getProductId())){
			throw new PruebaException(PruebaStatusEnum.DATO_EXIST);
		}
		this.data2.put(product.getProductId(), product);
	}
	
	@Override
	public void edit(Product product) throws PruebaException {
		if(!this.data2.containsKey(product.getProductId())){
			throw new PruebaException(PruebaStatusEnum.DATO_NOT_EXIST);
		}
		this.data2.put(product.getProductId(), product);
	}
	
	@Override
	public void remove(Long productId) {
		this.data2.remove(productId);
	}
	
	@Override
	public List<Product> list() {
		return this.data2.entrySet().stream().map(row -> row.getValue()).collect(Collectors.toList());
	}
}
