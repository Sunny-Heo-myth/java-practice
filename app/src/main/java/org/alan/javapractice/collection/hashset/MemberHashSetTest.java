package org.alan.javapractice.collection.hashset;

import org.alan.javapractice.collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member("Lee");
		Member memberHeo = new Member("Heo");
		Member memberHan = new Member("Han");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberHeo);
		memberHashSet.addMember(memberHan);
		memberHashSet.showAllMember();
		
		Member memberKim = new Member("Kim");
		memberHashSet.addMember(memberKim);
		memberHashSet.showAllMember();
	}

}
