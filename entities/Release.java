package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities;

public abstract class Release extends Object {
	
	private Artist artist;
	private String title;
	private int year;
	
	public Release() {
		// TODO Auto-generated constructor stub
		this.artist = new Artist();
		this.setYear(1900);
		this.setTitle(null);
	}
	
	public Release(Release orig) {
		// TODO Auto-generated constructor stub
		this.setArtist(new Artist(orig.getArtist()));
		this.setTitle(orig.getTitle());
		this.setYear(orig.getYear());
	}
	
	public Release(String title, Artist artist, int year) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.artist = artist;
		this.year = year;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public String getTitle() {
		
		if (this.title == null) {
			return null;
		}
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		
		if(year >= 0) {
			this.year = year;
		}
	}
	
//	Get a textual representation of this release.
//	The string representation of a release is "title-artist-year-totaltime"
//	(without quotes and all names substituted with their respective values) 
//	unknown field are represented by the string "unknown" (without quotes) *
	@Override
	public String toString() {
		
		return String.format("%s-%s-%s-%d", 
				(this.getTitle() != null) ? this.getTitle() : "unknown", 
				(this.getArtist() != null) ? this.getArtist().getName() : "unknown", 
				(this.getYear() != 0) ? this.getYear() : "unknown", 
				this.totalTime());
	}
	
	public abstract int totalTime();

}
