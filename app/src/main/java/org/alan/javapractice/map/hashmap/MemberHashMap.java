package org.alan.javapractice.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import org.alan.javapractice.collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
	}

	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)) {
			hashMap.remove(memberID);
			return true;
		}
		System.out.println(memberID + " does not exist.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
