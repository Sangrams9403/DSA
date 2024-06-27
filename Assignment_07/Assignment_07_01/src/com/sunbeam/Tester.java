package com.sunbeam;

import java.util.Scanner;

public class Tester {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str2=sc.next();
		String str = "Hello how are you are you there";
		String [] str1 = str.split(" ");
		HashMap h = new HashMap(str1);
		h.put(str1);
		h.display();
		
		

	}

}
