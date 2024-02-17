package org.alan.javapractice.singleton;

public class Company {
	private static Company instance = new Company();
	// Other class can not create instance directly.
	private Company() {}
	
	public static Company getInstance(){
		if(instance == null) {
			instance = new Company();
		}
		return instance; // The only instance can be made by this method.
	}
}
