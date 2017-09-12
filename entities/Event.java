package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities;

import bwi.prog.utils.Date;
import bwi.prog.utils.Venue;

public class Event extends Object {

	private Artist artist = new Artist();
	private int attendees;
	private Date date = new Date();
	private String description;
	private Venue venue = new Venue();

	public Event() {
		// TODO Auto-generated constructor stub

		this.setArtist(artist);
		this.setVenue(null);
		this.setDescription("");
		this.setDate(null);
		this.setAttendees(attendees);
	}
	
	public Event(Event e) {
		
		this.setArtist(new Artist(e.artist));
		this.setAttendees(e.getAttendees());
		this.setDate(new Date(e.date));
		this.setDescription(e.getDescription());
		this.setVenue(new Venue(e.venue));
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {

		if (artist == null) {
			return;
		}
		this.artist = artist;
	}

	public int getAttendees() {
		return attendees;
	}

	public void setAttendees(int attendees) {

		if (attendees < 0) {
			return;
		}
		this.attendees = attendees;
	}

	public Date getDate() {
		if(this.date != null) {
			return new Date(this.date);
		}
		return null;
	}
	
	public void setDate(Date date) {
		if(date == null){
			return;
		}
		this.date = new Date(date);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {

		if (description == null) {
			return;
		}
		this.description = description;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public int impact() {

		return this.getAttendees() * 2;
	}

	// returns a String representation of this event the string representation
	// of an event is (without quotes, but including line breaks):
	// "artist" @ "venue name" on "date"
	// "description"
	// ("attendees" attending ("impact"))
	//
	// if a value is not available, replace it with "unknown"
	@Override
	public String toString() {
		return String.format("%s @ %s on %s\n%s\n(%d attending (%d))", 
				this.artist.getName(), 
				(this.getVenue() != null) ? this.venue.getName() : "unknown" , 
				(this.getDate() != null && this.getDate().getYear() != 1970) ? this.date.toString(): "null",
				this.getDescription(),
				this.getAttendees(),
				this.impact()
				);
	}

}// end of class
