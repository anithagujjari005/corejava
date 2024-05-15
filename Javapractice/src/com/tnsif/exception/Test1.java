package com.tnsif.exception;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("core java");
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
//		catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
		finally {
			System.out.println("welcome");
		}

	}

}
