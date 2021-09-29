package com.evalfinal.tiendaonline.service.impl;

import com.evalfinal.tiendaonline.converter.ClientRequestToModel;
import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Client;
import com.evalfinal.tiendaonline.repository.ClientRepository;
import com.evalfinal.tiendaonline.request.ClientDelRequest;
import com.evalfinal.tiendaonline.request.ClientRequest;
import com.evalfinal.tiendaonline.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Autowired
	private ClientRequestToModel clientRequestConverter;
	
	
	@Override
	public void add(ClientRequest client) throws PruebaException {
		Client clientModel = clientRequestConverter.convert(client);
		repository.add(clientModel);
	}
	
	@Override
	public void edit(ClientRequest client) throws PruebaException {
		Client clientModel = clientRequestConverter.convert(client);
		repository.edit(clientModel);
	}
	
	@Override
	public void remove(ClientDelRequest clientId) {
	repository.remove(clientId.getClientId());
	}
	
	@Override
	public List<Client> list() {
		return repository.list();
	}
}
