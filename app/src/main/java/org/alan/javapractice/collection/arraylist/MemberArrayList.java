package org.alan.javapractice.collection.arraylist;

import java.util.ArrayList;
import org.alan.javapractice.collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println("non-exist");
		return false;
	}
	
	public void insertMember(Member member, int position) {
		if(position < 0 || position > arrayList.size() + 1) {
			System.out.println("Not addable at the index.");
		}
		arrayList.add(position - 1, member);
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
