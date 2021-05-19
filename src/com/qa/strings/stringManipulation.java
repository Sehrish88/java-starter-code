package com.qa.strings;

public class stringManipulation {
	public static void main(String args[]) {
//		String str1 = "yesterday it was raining";
//		 String str2 = "today it is sunny";
//		 System.out.println(str2.toUpperCase()+", "+str1.toUpperCase());
//		 
//		 String mySubString1 = str2.substring(0, 11);
//		 String mySubString2 = str1.substring(16, 24);
//		 System.out.println(mySubString1 + mySubString2);
		stringsManipulate("I love Java and programming"); 
	}
	public static void stringsManipulate(String input) {
		System.out.println(input.substring(10, 15));
		System.out.println(input.substring(0, 1));
		System.out.println(input.substring(1, 2));
		System.out.println(input.substring(2, 3));
		int counter = 1; 
		for(int i = 0; i < input.length(); i++) {
			if(input.substring(i, i +1).equals(" ")) {
				counter++;
				System.out.println(counter);
			}
		}
	}
}
