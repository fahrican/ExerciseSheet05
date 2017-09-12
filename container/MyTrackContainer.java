package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.container;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities.Track;
import bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.util.MyMatcher;

public class MyTrackContainer extends Object {

	private List<Track> selection;
	private Set<Track>	tracks;
	
	
	// Default Initialization
	public MyTrackContainer() {
		selection = new ArrayList<Track>();
		tracks = new HashSet<Track>();
	}
	
	// Initialize MyTrackContainer with an Iterable
	public MyTrackContainer(Iterable<Track> t) {
		this();
		for(Iterator<Track> it = t.iterator(); it.hasNext();) {
			tracks.add(it.next());
		}
		this.reset();
	}
	
	// Initialize MyTrackContainer with a Track[] Array
	public MyTrackContainer(Track[] t) {
		this();
		for(int i = 0; i < t.length; i++) {
			tracks.add(t[i]);
		}
		this.reset();
	}
	
	// Sorts a list according to a given Comparator in a given order
	public void sort(Comparator<Track> theComp, boolean asc) {
		Collections.sort(selection, theComp);
		if(!asc) Collections.reverse(selection);
	}
	
	// Returns the number of tracks in the selection that match a given matcher
	public int filter(MyMatcher<Track> matcher) {
		int count = 0;
		for(Iterator<Track> it = selection.iterator(); it.hasNext();) {
			Track current = it.next();
			if(!matcher.matches(current)) {
				it.remove();
				count++;
			}
		}
		return count;
	}
	
	
	// Deletes the current selection and adds all tracks to the selection
	public void reset() {
		selection.clear();
		for(Iterator<Track> it = tracks.iterator(); it.hasNext();) {
			selection.add(it.next());
		}
	}
	
	// Removes all tracks, that are currently selected
	// and adds all remaining tracks to the selection
	public int remove() {
		int count = 0;
		for(Iterator<Track> it = selection.iterator(); it.hasNext();) {
			tracks.remove(it.next());
			it.remove();
			count++;
		}
		reset();
		return count;
	}
	
	// Adds all tracks of a given Track Array, that are not in the Track List yet.
	public int addAll(Track[] t) {
		for(int i = 0; i < t.length; i++) {
			if(!tracks.contains(t[i])) tracks.add(t[i]);
		}
		return t.length;
	}
	
	// returns the number of tracks
	public int size() {
		return tracks.size();
	}
	
	// returns the current selection as Array
	public Track[] selection() {
		return selection.toArray(new Track[selection.size()]);
	}
	
	// Adds a non-null track to the track list
	public boolean add(Track t) {
		if(t == null || tracks.contains(t)) return false;
		tracks.add(t);
		return true;
	}
	
}//end of class
