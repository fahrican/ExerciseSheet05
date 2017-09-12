package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.formatters;

import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities.Track;
import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.MyFormatter;

public class ShortTrackFormatter extends Object implements MyFormatter<Track>{
	
	private Track shortTrack;
	
	public ShortTrackFormatter() {
		// TODO Auto-generated constructor stub
	}
	
	//Get the headers for the table as a single string.
	//Contains the names for all columns separated by the correct number of blanks.
	@Override
	public String header() {
		return "Title      (min:sec)";
	}
	
	//The short representation of a track is "title (duration)" (without quotes).
	//Title is exactly ten characters wide with leading blanks (if any). 
	//Duration is in the format minutes:seconds, both at least two digits wide with leading zeros.
	@Override
	public String format(Track t) {
		return String.format("%-10.10s (%02d:%02d)", 
				t.getTitle(), 
				(t.getDuration() / 60), 
				(t.getDuration() - 60*(t.getDuration() / 60)));
	}

	@Override
	public String topSeparator() {
		// TODO Auto-generated method stub
		return "--------------------";
	}
	
	//the string representation of this formatter is
	//"short format [Title (min:sec)]" (without quotes)
	public String toString(){
		return "short format [Title (min:sec)]";
	}

}//end of class
