package com.flipkart.client;

//Multiple

class A {
	public int a1() {
		return 0;
	}
	private int a2() {
		return 4;
	}
}

class B{
	public int b1() {
		return 2;
	}
	
	public int b2() {
		return 2;
	}
}

class C extends A, B{
	public int c1() {
		return 2;
	}
	
	public int c2() {
		return 2;
	}
}

public class DummyMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
