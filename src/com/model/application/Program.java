package com.model.application;

import java.util.Scanner;

import com.model.entities.Department;
import com.model.implement.FactoryDao;
import com.model.implement.ImplementOperations;

public class Program {

	private static int opc;
	private static Scanner sc = new Scanner(System.in);
	private static ImplementOperations iop = null;

	public static void registrationDepartment() {

		System.out.println(" Register of Department");
		System.out.println();
		sc.nextLine();
		System.out.print(" Name.: ");
		String name = sc.nextLine();

		Department dp = new Department(name);
		iop = FactoryDao.createDepartment();
		iop.insert(name);

	}

	public static void updateDepartment() {

	}

	public static void findByID() {

		System.out.println();
		System.out.println(" Find By Id (Seller/Department)");
		System.out.println();
		sc.nextLine();
		System.out.print(" Informe o ID.: ");
		int id = sc.nextInt();
		System.out.println();
		System.out.println(" ================ Information Seller ================ ");
		System.out.println();
		iop = FactoryDao.createSeller();
		System.out.println(iop.findById(id));
		System.out.println(" ==================================================== ");
	}

	public static void main(String[] args) {

		System.out.println("");
		System.out.println(" 1-)Registration Department");
		System.out.println(" 2-)Update Department");
		System.out.println(" 3-)Find by Id (Seller/Department)");
		System.out.println();
		System.out.print(" Choose option.: ");
		opc = sc.nextInt();
		System.out.println();
		System.out.println("====================================================");

		switch (opc) {
		case 1:
			registrationDepartment();
			break;
		case 2:
			updateDepartment();
		case 3:
			findByID();
			break;
		default:
			break;
		}

	}

}
