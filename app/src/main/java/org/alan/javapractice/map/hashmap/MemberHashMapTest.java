package org.alan.javapractice.map.hashmap;

import org.alan.javapractice.collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member("Lee");
		Member memberSon = new Member("Son");
		Member memberHan = new Member("Han");
		Member memberHeo = new Member("Heo");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberHan);
		memberHashMap.addMember(memberHeo);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
	}

}
