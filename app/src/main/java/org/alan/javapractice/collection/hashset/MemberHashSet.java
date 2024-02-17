package org.alan.javapractice.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import org.alan.javapractice.collection.Member;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberID + "Does not exist.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
