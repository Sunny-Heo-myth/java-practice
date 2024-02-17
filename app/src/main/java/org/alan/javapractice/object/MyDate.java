package org.alan.javapractice.object;

public class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
		
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate x = (MyDate) obj;
					
				if(this.day == x.day & this.month == x.month & this.year == x.year) 
					return true;
				else return false;
				
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return day;
	}

}
