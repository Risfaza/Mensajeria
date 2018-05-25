package com.tikal.mervel.dao;

import com.tikal.mervel.modelo.login.SessionEntity;

public interface SessionDao {

	public void save(SessionEntity s);

	public void delete(SessionEntity s);

	public void update(SessionEntity s);
	
	public SessionEntity consult(String id);
	
	public SessionEntity getByName(String nameUser);
}
