package com.flipkart.client;

//Multilevel

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

class C extends B{
	public int c1() {
		return 2;
	}
	
	public int c2() {
		return 2;
	}
}

class D extends C{
	public int d1() {
		return 2;
	}
	
	public int d2() {
		return 2;
	}
}



public class DummyMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
