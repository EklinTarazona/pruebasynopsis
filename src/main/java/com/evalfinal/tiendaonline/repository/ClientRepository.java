package com.evalfinal.tiendaonline.repository;

import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Client;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClientRepository {
	public void add(Client client) throws PruebaException;
	public void edit(Client client) throws PruebaException;
	public void remove(Long clientId);
	public List<Client> list();
}
