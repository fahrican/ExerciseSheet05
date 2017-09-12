package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities;

import java.lang.Comparable;

public class Artist extends Object implements Comparable<Artist>{

	private String name;
	
	public Artist() {
		// TODO Auto-generated constructor stub
		this.setName("unknown");;
	}
	
	public Artist(Artist a) {
		// TODO Auto-generated constructor stub
		this.name = a.name;
	}
	
	public Artist(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		
		if (name != null && !name.trim().isEmpty()) {
			this.name = name;
		}
		else {
			this.setName("unknown");
		}
	}
	
	//@Override
	public String toString(){
		
		if (this.getName() != null) {
			return this.getName();
		}
		return "unknown";
	}
	
	@Override
	public int compareTo(Artist arg0) {
		// TODO Auto-generated method stub
		
		return this.getName().compareTo(arg0.getName());
	}
	
	
}//end of class
