package com.evalfinal.tiendaonline.converter;

import com.evalfinal.tiendaonline.model.Product;
import com.evalfinal.tiendaonline.request.ProductRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProductRequestToModel implements Converter<ProductRequest, Product> {
	
	@Override
	public Product convert(ProductRequest source) {
		Product product = new Product();
		BeanUtils.copyProperties(source, product);
		return product;
	}
}
