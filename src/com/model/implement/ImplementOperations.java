package com.model.implement;

import java.util.List;

public interface ImplementOperations {

	void insert(Object obj);

	void update(Object obj);

	void deleteById(int id);
	
	Object findById(int id);
	
	List<Object> findAll();
}
