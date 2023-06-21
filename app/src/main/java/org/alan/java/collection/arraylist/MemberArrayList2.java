package org.alan.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import org.alan.java.collection.Member;

public class MemberArrayList2 {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList2() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = arrayList.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberID + " does not exist.");
		return false;
	}
	

}