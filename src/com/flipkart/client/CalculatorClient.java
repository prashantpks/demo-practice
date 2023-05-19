/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.CalculatorBusiness;
import com.flipkart.business.SciCalculatorBusiness;

/**
 * @author prashant.k5
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// access the Business Methods with create the instance of class
		
//		CalculatorBusiness business = new CalculatorBusiness();
		SciCalculatorBusiness sciBusiness = new SciCalculatorBusiness();
		
		System.out.println("Addition of the number--->" + sciBusiness.addition(10, 10));
		System.out.println("Subtraction of the number --> "+ sciBusiness.subtraction(20, 10));
		System.out.println("Multiplication of the number --> "+ sciBusiness.multiply(20, 10));
		System.out.println("Division of the number --> "+ sciBusiness.divide(20, 10));
		
		// Assignment part
		System.out.println("Square Root of the number --> "+ sciBusiness.squareRoot(5.0));
		System.out.println("Sine of the number --> "+ sciBusiness.sine(15.0));
		System.out.println("Cosine of the number --> "+ sciBusiness.cosine(20.0));
		System.out.println("Tan of the number --> "+ sciBusiness.tan(20.0));
		System.out.println("Exponent of the number --> "+ sciBusiness.exp(2.5));
		
		//Creating instance of abstract class
//		DemoAbstract demoabs = new DemoAbstract();
		System.out.println(sciBusiness.testHello());
		System.out.println(sciBusiness.testHi());
	}

}
