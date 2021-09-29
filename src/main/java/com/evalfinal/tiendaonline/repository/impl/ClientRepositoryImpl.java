package com.evalfinal.tiendaonline.repository.impl;

import com.evalfinal.tiendaonline.enumeration.PruebaStatusEnum;
import com.evalfinal.tiendaonline.exception.PruebaException;
import com.evalfinal.tiendaonline.model.Client;
import com.evalfinal.tiendaonline.repository.ClientRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ClientRepositoryImpl implements ClientRepository {
	
	public final Map<Long, Client> data;
	
	ClientRepositoryImpl(){
		this.data = new HashMap<>();
	}
	
	@Override
	public void add(Client client) throws PruebaException {
		if(this.data.containsKey(client.getClientId())){
			throw new PruebaException(PruebaStatusEnum.DATO_EXIST);
		}
		this.data.put(client.getClientId(), client);
	}
	
	@Override
	public void edit(Client client) throws PruebaException {
		if(!this.data.containsKey(client.getClientId())){
			throw new PruebaException(PruebaStatusEnum.DATO_NOT_EXIST);
		}
		this.data.put(client.getClientId(), client);
	}
	
	@Override
	public void remove(Long clientId) {
		this.data.remove(clientId);
	}
	
	@Override
	public List<Client> list() {
		
		return this.data.entrySet().stream().map(row -> row.getValue()).collect(Collectors.toList());
	}
}
