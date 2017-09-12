package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.matcher;

import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.MyMatcher;
import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities.Track;

public class TitleMatcher extends MyMatcher<Track>{
	
	private String pattern;
	
	public TitleMatcher(String pat) {
		super(pat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean matches(Track t) {
		// TODO Auto-generated method stub
		return t.getTitle().matches(this.pattern + ".+");
	}

	@Override
	public void setPattern(String pat) {
		// TODO Auto-generated method stub
		if (pat == null) {
			return;
		}
		this.pattern = pat;
	}

	@Override
	public String getPattern() {
		// TODO Auto-generated method stub
		return this.pattern;
	}
	
//	the string representation is title starts with (PATTERN)
//	with range as described in getPAttern
	@Override
	public String toString(){
		return String.format("title starts with (%s)", this.getPattern());
	}

}//end of class
