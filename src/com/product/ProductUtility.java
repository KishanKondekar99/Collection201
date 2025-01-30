package com.product;

import java.util.Scanner;

public class ProductUtility {

	static Scanner sc = new Scanner(System.in);

	static ProductEntity PreparedStatement() {

		System.out.println("Enter Product Id");
		int ID = sc.nextInt();

		System.out.println("Enter Product Name");
		String name = sc.next();

		System.out.println("Enter product Qty");
		int qty = sc.nextInt();

		System.out.println("Enter product  price");
		Double price = sc.nextDouble();

		System.out.println("Enter mfg Date");
		String mfgdate = sc.next();

		System.out.println("Enter exp Date");
		String expdate = sc.next();

		ProductEntity ProductEntity = new ProductEntity(ID, name, qty, qty, mfgdate, expdate);

		return ProductEntity;
	}

}
