package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.matcher;

import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.MyMatcher;
import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities.Track;

public class DurationMatcher extends MyMatcher<Track>{
	
	private int lower;
	private int upper;
	private String pattern;
	
	public DurationMatcher() {
		// TODO Auto-generated constructor stub
		super("0 2147483647");
	}
	 
	public DurationMatcher(String pat) {
		super(pat);
		// TODO Auto-generated constructor stub
	}
	
	//A track matches if its duration is in the range accepted by this matcher.
	@Override
	public boolean matches(Track t) {
		// TODO Auto-generated method stub
		
		if (t == null) {
			return false;
		}
		
		if (t.getDuration() < lower || t.getDuration() > upper) {
			return false;
		}
		
		return true;
	}
	
	
//	Sets the pattern of this matcher.
//	Interprets the argument as described in the class documentation. First sets the lower, then the upper bound.
//	The bounds specified are set if and only if at the time of setting they are actually lower 
//	(for the lower bound) or higher (for the upper bound) than the other or at least equal to the other.
	@Override
	public void setPattern(String pat) {
		// TODO Auto-generated method stub
		if(pat == null){
			return;
		}
		if(!pat.matches("\\d+ \\d+")){
			return;
		}
		String[] bounds = pat.split(" ");
		int l = Integer.parseInt(bounds[0]);
		int u = Integer.parseInt(bounds[1]);
		if(lower == 0 && upper == 0) {
			lower = l;
			upper = u;
		} else {
			if(l <= upper) {
				lower = l;
			}
			if(u >= lower) {
				upper = u;
			}
		}
		pattern = pat;
	}

	@Override
	public String getPattern() {
		return this.pattern;
	}
	
//	the string representation is duration in range (RANGE)
//	with range as described in getPattern
	@Override
	public String toString() {
		
		return String.format("duration in range (%s)", this.getPattern());
	}
	
}//end of class
