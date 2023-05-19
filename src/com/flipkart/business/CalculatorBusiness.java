/**
 * 
 */
package com.flipkart.business;

import com.flipkart.demoabstract.DemoAbstract;

/**
 * @author prashant.k5
 *
 */
public class CalculatorBusiness extends DemoAbstract{
	// Write some business methods here

	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	@Override
	public String testHello() {
		// TODO Auto-generated method stub
		return "I am the abstract method implementation";
	}
}
