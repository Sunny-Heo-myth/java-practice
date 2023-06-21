package org.alan.java.collection;

public class Member implements Comparable<Member>{
	private static int serialNum = 1000;
	private int memberID;
	private String memberName;
	
	public Member(String memberName) {
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
	public int compareTo(Member member) {
		return (this.memberID - member.memberID);
	}
}
