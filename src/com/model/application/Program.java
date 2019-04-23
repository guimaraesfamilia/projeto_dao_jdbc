package com.model.application;

import java.util.Scanner;

import com.model.implement.FactoryDao;
import com.model.implement.ImplementOperations;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		ImplementOperations iop = FactoryDao.createSeller();
		
		
		System.out.print("Enter Id seller.: ");
		int id = sc.nextInt();
		
		System.out.println(iop.findById(id));

	}

}
