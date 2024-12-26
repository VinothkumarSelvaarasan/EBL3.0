package com.iisn.loosely;

public class MainMethod {
	public static void main(String[] args) {
		College c=new StaffClass();
		LooselyCoupled lc=new LooselyCoupled();
		lc.setCollege(c);
		lc.getCollege().getDetails();
		lc.getCollege().printDetails();
	}

}
