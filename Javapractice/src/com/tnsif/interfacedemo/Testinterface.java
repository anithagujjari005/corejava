package com.tnsif.interfacedemo;

public class Testinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new SBI();
		System.out.println("ROI" +b.rateofintresent());
		
	    Bank p=new PNB();
	    
	    System.out.println("ROI"+p.rateofintresent());


	}

}
