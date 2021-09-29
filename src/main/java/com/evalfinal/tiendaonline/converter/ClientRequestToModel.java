package com.evalfinal.tiendaonline.converter;

import com.evalfinal.tiendaonline.model.Client;
import com.evalfinal.tiendaonline.request.ClientRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ClientRequestToModel implements Converter<ClientRequest, Client> {
	
	@Override
	public Client convert(ClientRequest source) {
		Client client = new Client();
		BeanUtils.copyProperties(source, client);
		return client;
	}
}
