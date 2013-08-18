package com.mx.inttec.jdbcejemplo.dao;

import java.io.Serializable;
import java.util.List;

public interface DaoGenerico <T, PK extends Serializable> {
	
	void create(T newInstance);
	void update(T newInstance);
	T read(PK pk);
	void delete(T newInstancie);
	List<T> findAll();

}
