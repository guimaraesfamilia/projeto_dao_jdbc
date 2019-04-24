package com.model.implement;

import com.model.entities.Department;
import com.model.entities.Seller;

public class FactoryDao {


	

	public static Seller createSeller() {
		
		return new Seller();
	}
	
	public static Department createDepartment() {
		
		return new Department();
	}
}

