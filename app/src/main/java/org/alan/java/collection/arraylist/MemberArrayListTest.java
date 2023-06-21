package org.alan.java.collection.arraylist;

import org.alan.java.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member("Lee");
		Member memberHeo = new Member("Heo");
		Member memberKim = new Member("Kim");
		Member memberHan = new Member("Han");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberHeo);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberHan);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberLee.getMemberID());
		
		memberArrayList.insertMember(memberLee, 4);
		
		memberArrayList.showAllMember();
		
	}
}
