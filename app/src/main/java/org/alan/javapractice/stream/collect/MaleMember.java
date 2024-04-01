package org.alan.javapractice.stream.collect;

import org.alan.javapractice.stream.stream.Member;

import java.util.ArrayList;
import java.util.List;

public class MaleMember {

    private List<Member> list;

    public MaleMember() {
        this.list = new ArrayList<Member>();
        System.out.println(Thread.currentThread().getName() + " MaleStudent()");
    }

    public void accumulate(Member member) {
        list.add(member);
        System.out.println(Thread.currentThread().getName() + " accumulate()");
    }

    public void combine(MaleMember others) {
        list.addAll(others.getList());
        System.out.println(Thread.currentThread().getName() + " combine()");
    }

    public List<Member> getList() {
        return list;
    }
}
