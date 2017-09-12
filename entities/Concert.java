package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities;

public class Concert extends Event {
	
	private int nextIdx = 0;
	private Track[] setList = new Track[nextIdx];
	
	public Concert() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean addTrack(Track t) {
		
		if (t != null) {
			
			ensureCapacity(this.setList.length + 1);
			this.setList[nextIdx] = t;
			nextIdx++;
			return true;
		}
		return false;
	}
	
	public int duration() {
		
		int total  = 0;
		for (int i = 0; i < this.setList.length; i++) {
			
			if (this.setList[i].getDuration() < 0) {
				total += 0;
			}
			total += this.setList[i].getDuration();
		}
		return total;
	}
	
	private void ensureCapacity(int length) {
		
		if (length > this.setList.length) {
			
			Track[] tempArr = new Track[length];
			for (int i = 0; i < this.setList.length; i++) {
				
				tempArr[i] = this.setList[i];
			}
			this.setList = tempArr;
		}
	}
	
	@Override
	public int impact() {
		// TODO Auto-generated method stub
		int minutes = this.duration() / 60;
		int factor = 0;
		boolean loop = true;
		while (loop) {
			
			if (minutes >= 30) {
				minutes -= 30;
				factor++;
			}
			else if (minutes > 0) {
				minutes -= 30;
				factor++;
			}
			else {
				loop = false;
			}
		}
		return this.getAttendees() * factor;
	}
	
	public int nrTracks() {
		
		return this.setList.length;
	}
	
	public void resetSetList() {
		
		this.setList = new Track[0];
		this.nextIdx = 0;
	}
	
	public Track[] getSetList() {
		
		if (this.setList.length == 0) {
			return new Track[0];
		}
		
		Track[] copyList = new Track[this.setList.length];
		for (int i = 0; i < this.setList.length; i++) {
			
			copyList[i] = new Track(this.setList[i]);
		}
		return copyList;
	}

	public void setSetList(Track[] tracks) {
		
		int temp = 1;
		this.nextIdx = 0;
		for(int i = 0; i < tracks.length; i++) {
			if(tracks[i] != null) {
				this.ensureCapacity(temp);
				this.setList[this.nextIdx++] = new Track(tracks[i]);
				temp++;
			}
		}
		this.nextIdx = this.setList.length;
	}
	
	private String formatDuration() {
		int dMinutes = this.duration() / 60;
		int dHours = 0;
		while(dMinutes - 60 > 0) {
			dHours++;
			dMinutes = dMinutes - 60;
		}
		return String.format("%02d:%02d", dHours, dMinutes);
		
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("\n%d tracks played, total duration %s.", 
				this.nrTracks(), this.formatDuration()); 
	}
	
}//end of class
