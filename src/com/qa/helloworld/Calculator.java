package com.qa.helloworld;

public class Calculator {
	public static void main(String[] args) {
		sum(5,6);
		multiplication(5,6);
		subtraction(48,7);
		division(64,8);

	} 
	public static int sum(Integer input1, Integer input2) {
		Integer result = input1 + input2;
		System.out.println(result);
		return result;
	}
	
	public static int multiplication(Integer input1, Integer input2) {
		Integer result = input1 * input2;
		System.out.println(result);
		return result;
		
	}
	public static int subtraction(Integer input1, Integer input2) {
		Integer result = input1 - input2;
		System.out.println(result);
		return result;
	}
	public static int division(Integer input1, Integer input2) {
		Integer result = input1 / input2;
		System.out.println(result);
		return result; 
	}
}
