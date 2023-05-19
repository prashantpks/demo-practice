/**
 * 
 */
package com.flipkart.business;

import java.lang.Math;
/**
 * @author prashant.k5
 *
 */
public class SciCalculatorBusiness extends CalculatorBusiness{
	public double squareRoot(double a) {
		return Math.sqrt(a);
	}
	
	public double sine(double a) {
		return Math.sin(a);
	}
	
	public double cosine(double a) {
		return Math.cos(a);
	}
	
	public double tan(double a) {
		return Math.tan(a);
	}
	
	public double exp(double a) {
		return Math.exp(a);
	}
}
