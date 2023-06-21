package org.alan.java.polymorphism;

public class Engineer extends Employee{
	private String skillset;
	
	public Engineer(String name) {
		super(name);
		
	}
	
	public String getSkillSet() {
		return skillset;
	}
	
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
}
