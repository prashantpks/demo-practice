/**
 * 
 */
package com.flipkart.client;

/**
 * @author prashant.k5
 *
 */

// Single level
class A {
	public int a1() {
		return 0;
	}
	private int a2() {
		return 4;
	}
}

class B extends A{
	public int b1() {
		return 2;
	}
	
	public int b2() {
		return 2;
	}
}


public class Dummy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
