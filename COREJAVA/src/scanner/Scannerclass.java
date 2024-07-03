package scanner;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {// Java program to read data of various types
		// using Scanner class.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		
		String name = sc.nextLine();
		System.out.println("nameis"+name);
		System.out.println(" enter roll");
		
		int roll = sc.nextInt();
		System.out.println("roll no is"+roll);
	}
} 