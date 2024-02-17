package org.alan.javapractice.exception;

public class PasswordExceptionTest {

	private String userPW;
	
	public String getUserPW() {
		return userPW;
	}
	
	public void setUserPW(String userPW) throws PasswordException{
		if(userPW == null) {
			throw new PasswordException("PW can not be null.");
		}
		else if(userPW.length() < 6) {
			throw new PasswordException("PW should be longer than 5.");
		}
		else if(userPW.matches("[a-zA-Z]+")) {
			throw new PasswordException("PW should be alphanumeric.");
		}
		this.userPW = userPW;
	}
		
	
	public static void main(String[] args) {
		
		PasswordExceptionTest test = new PasswordExceptionTest();
		String userPW = null;
		
		try {
			test.setUserPW(userPW);
		}
		catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPW = "12345";
		
		try {
			test.setUserPW(userPW);
		}
		catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		userPW = "abdsfdc";
		
		try {
			test.setUserPW(userPW);
		}
		catch(PasswordException e) {
			System.out.println(e.getMessage());
		}

	}
}
