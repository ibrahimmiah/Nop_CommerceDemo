package com.mahfuz.osa;

import java.util.Scanner;

public class Mahfuz {
	public static void main(String[] args) {
		 //scannerDemo();
		// swapDemo();
		// mirrorReverse();
		wordReverse();
	}

	public static void scannerDemo() {
		Scanner input = new Scanner(System.in);
		// int a=input.nextInt();
		String a = input.nextLine();
		System.out.println(" input coming from the scanner class = " + a);
	}

	public static void swapDemo() {

		String a = "today";
		String b = " is 11/29/2021";// 14
		a = a + b; // today is 11/29/2021 19
		// b = a.substring(0, a.length() - b.length());
		b = a.substring(0, a.length() - b.length());// today
		a = a.substring(b.length());
		// System.out.println("a.length() = "+a.length()+"\nb.length() =
		// "+b.length()+"\na.length()-b.length() = "+(a.length()-b.length()));
		System.out.println("a = " + a + "\nb= " + b);
	}

	public static void mirrorReverse() {
		String name = "Today is friday";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
	}

	public static void wordReverse() {
		// String name="Today is friday";
		String name = "madama";
		// String a[]=name.split("");
		String rev = "";
		// String a[]=name.split(" ");
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
			System.out.println(i+" "+rev);
		}
		if (rev.equals(name)) {
			System.out.print(name+" is a Palindrome " );
		} else {
			System.out.println( name+" is Not a palindrome ") ;
		}
	}

}
