package com.jangra.tech.calculator;

public class BasicCalculator {
	public int add(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}
	
	public int substact(int firstNum, int secondNum) {
		return firstNum - secondNum;
	}
	
	public int multiply(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}
	
	public int devide(int dividend, int divisor) throws Exception {
		if(divisor == 0) {
			throw new Exception("Divisor can not be 0");
		}
		return dividend / divisor;
	}
}
