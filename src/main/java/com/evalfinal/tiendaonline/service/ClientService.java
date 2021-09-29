package com.evalfinal.tiendaonline.service;

import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Client;
import com.evalfinal.tiendaonline.request.ClientDelRequest;
import com.evalfinal.tiendaonline.request.ClientRequest;

import java.util.List;

public interface ClientService {
	
	public void add(ClientRequest client) throws PruebaException;
	public void edit(ClientRequest client) throws PruebaException;
	public void remove(ClientDelRequest clientId);
	public List<Client> list();
}
