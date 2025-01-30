package com.product;

import java.util.Scanner;

public class TestproductController {

	public static void main(String[] args) {

//		ProductoperationService operation = new ProductoperationService();
//
//		ProductEntity preparedStatement = ProductUtility.PreparedStatement();   
//
//		String msg = operation.addProduct(preparedStatement);
//		
//		System.out.println(msg);
//
//	}
		ProductoperationService operation = new ProductoperationService();

		Scanner scanner = new Scanner(System.in);

		int choise = 0;

		do {

			System.out.println("1.Add product");
			System.out.println("2.get specific product");
			System.out.println("3.get All product");

			System.out.println("Enter your Choise please ");
			choise = scanner.nextInt();

			switch (choise) {
			case 1: {
				System.out.println("Press 1");

				ProductEntity preparedStatement = ProductUtility.PreparedStatement();
				String product = operation.addProduct(preparedStatement);
				System.out.println(product);
				break;
			}

			case 2: {
				System.out.println("press 2");
				break;
			}
			case 3: {
				System.out.println("Press 3");
				break;
			}

			default:

				System.out.println("Invalid");
			}

		} while (choise != 0);

		System.out.println("Not Applicable");
	}
}