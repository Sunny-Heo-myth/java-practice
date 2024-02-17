package org.alan.javapractice.collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2>{
	private static int serialNum = 1000;
	private int memberID;
	private String memberName;
	
	public Member2(String memberName) {
		serialNum++;
		memberID = serialNum;
		this.memberName = memberName;
	}
	
	public int getMemberID() {
		return memberID;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + ", " + memberID;
	}
	
	@Override
	public int hashCode() {
		return memberID;
	}

	@Override
	public int compare(Member2 mem1, Member2 mem2) {

		return mem1.getMemberID() - mem2.getMemberID();
	}
}
