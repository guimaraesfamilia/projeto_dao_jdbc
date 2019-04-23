package com.model.application;

import java.util.Scanner;

import com.model.entities.Department;
import com.model.implement.FactoryDao;
import com.model.implement.ImplementOperations;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		ImplementOperations iop = null;
		
		
		/*System.out.print("Enter Id Department.: ");
		int id = sc.nextInt();
		
		System.out.println();
		System.out.println("Information of Deparment.:");
		System.out.println();
		iop = FactoryDao.createDepartment();
		System.out.println(iop.findById(id));*/
		
		
		System.out.println("Register of Department");
		System.out.println();
		System.out.print("Department name.: ");
		String name = sc.nextLine();
		
		iop = FactoryDao.createDepartment();
		Department dp = new Department(name);
		iop.insert(dp.getName());

	}

}
