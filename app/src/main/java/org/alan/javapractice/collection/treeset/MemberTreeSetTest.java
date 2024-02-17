package org.alan.javapractice.collection.treeset;

import org.alan.javapractice.collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member("Lee");
		Member memberHeo = new Member("Heo");
		Member memberHan = new Member("Han");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberHeo);
		memberTreeSet.addMember(memberHan);
		memberTreeSet.showAllMember();
		
		Member memberKim = new Member("Kim");
		memberTreeSet.addMember(memberKim);
		memberTreeSet.showAllMember();

	}

}
