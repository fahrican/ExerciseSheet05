package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.comparators;

import java.util.Comparator;
import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities.Track;

public class DurationComparator extends Object implements Comparator<Track> {
	
	public DurationComparator() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Track arg0, Track arg1) {
		// TODO Auto-generated method stub
		if (arg0.getDuration() < arg1.getDuration()) {
			return -1;
		}
		else if (arg0.getDuration() == arg1.getDuration()) {
			return 0;
		}
		return 1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("by duration");
	}

}//end of class
