package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities;

public class MusicVideo extends Release {
	
	private Track track;
	
	public MusicVideo() {
		// TODO Auto-generated constructor stub
	}
	
	public Track getTrack() {
		return track;
	}
	
	public void setTrack(Track track) {
		this.track = track;
	}
	
	

//Gets a String representation of this music video.
//The String representation of a music video simply adds "-(Video)" (without quotes) to the String 
//representation of a general release.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (this.track == null) {
			this.track = new Track();
		}
		return super.toString() + "-(Video)";
	}
	
	@Override
	public int totalTime() {
		// TODO Auto-generated method stub
		return this.getTrack().getDuration();
	}

	
	
}//end of class MusicVideo
