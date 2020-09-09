package com.ntolb.utilities;

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
	
	public Double divide(Double a, Double b) {
		Double result = 0.0;
		try {
			if(b != 0)
			result = a/b;
			else throw new ArithmeticException("/ by zero");
		}catch(ArithmeticException e) {
			System.out.println(e + ":  You cannot divide by zero.");
			result = (Double) null;
		} finally {
			return result;
		}
	}

}
