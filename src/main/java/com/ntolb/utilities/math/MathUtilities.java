package com.ntolb.utilities.math;

public class MathUtilities {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public void divide(int a, int b) throws ArithmeticException {
		
		try {
			int result = a / b;
			return result;
		} catch (ArithmeticException e) {
			System.out.println("DIVISION ERROR: CANNOT DIVIDE BY ZERO!!!");
		}
		
	}

}
