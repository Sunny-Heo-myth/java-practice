package org.alan.javapractice.map.treemap;

import org.alan.javapractice.collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberHashMap = new MemberTreeMap();
		
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
