package com.tnsif.exception;

public class Userdemo {
	public static void main(String[] args) {
		try {
			UserDefined.validate();
		} catch (Age e) {
			System.out.println("caught exception"+e.getMessage());
			
		}
	}
}
