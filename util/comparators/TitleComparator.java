package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.comparators;

import java.util.Comparator;
import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities.Track;

public class TitleComparator extends Object implements Comparator<Track>{

	@Override
	public int compare(Track o1, Track o2) {
		// TODO Auto-generated method stub
		
		if (o1 == null || o2 == null || o1.getTitle() == null || o2.getTitle() == null) {
			return 0;
		}
		
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("by title");
	}
	
}//end of class
