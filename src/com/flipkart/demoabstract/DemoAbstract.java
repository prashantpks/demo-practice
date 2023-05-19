/**
 * 
 */
package com.flipkart.demoabstract;

/**
 * @author prashant.k5
 *
 */
public abstract class DemoAbstract {
	//If implementation is not req we put abstract
	public abstract String testHello();
	
	public String testHi() {
		
		return "hey i m not abstract";
	}
}
