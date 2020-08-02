package com.jangra.tech.main;

import com.jangra.tech.calculator.BasicCalculator;

public class HelloMain {

	public static void main(String[] args) throws Exception {
		BasicCalculator calculator = new BasicCalculator();
		
		System.out.println("Addition : " + calculator.add(10, 20));
		System.out.println("Substraction : " + calculator.substact(20, 10));
		System.out.println("Multiply : " + calculator.multiply(10, 20));
		System.out.println("Division : " + calculator.devide(100, 20));
	}

}
