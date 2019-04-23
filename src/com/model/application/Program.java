package com.model.application;

import java.util.Scanner;

import com.model.implement.FactoryDao;
import com.model.implement.ImplementOperations;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		ImplementOperations iop = FactoryDao.createDepartment();
		
		
		System.out.print("Enter Id Department.: ");
		int id = sc.nextInt();
		
		System.out.println();
		System.out.println("Information of Deparment.:");
		System.out.println();
		System.out.println(iop.findById(id));
		

	}

}
