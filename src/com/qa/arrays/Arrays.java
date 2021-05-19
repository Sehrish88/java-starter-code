package com.qa.arrays;

public class Arrays {
	public static int twoDArray[][] = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};
	//public static int[] tenValues = new int[10]; 
	public static int[] tenValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

    public static void main(String[] args) {
        for(int[] a : twoDArray) {
            for(int b : a) {
                System.out.print(b);
            }
            System.out.println();
            
            System.out.println(tenValues); 
        }
    }
}
