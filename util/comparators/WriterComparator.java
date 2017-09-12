package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.comparators;

import java.util.Comparator;
import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities.Track;

public class WriterComparator extends Object implements Comparator<Track>{

	@Override
	public int compare(Track o1, Track o2) {
		// TODO Auto-generated method stub
		return o1.getWriter().getName().compareTo(o2.getWriter().getName());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("by writer");
	}
	
}//end of class
