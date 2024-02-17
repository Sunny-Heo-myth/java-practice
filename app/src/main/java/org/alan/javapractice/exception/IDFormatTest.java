package org.alan.javapractice.exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException{
		
		if(userID == null) {
			throw new IDFormatException("ID can not be null.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("ID should be longer than 7 & shorter than 21.");
		}
		
		this.userID = userID;
	}
	
	
	public static void main(String[] args) {
		
		IDFormatTest test = new IDFormatTest();
		String userID = null;
		
		try {
			test.setUserID(userID);
		}
		catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		}
		catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}

	}
}
