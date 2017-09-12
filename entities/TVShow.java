package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities;

public class TVShow extends Event{
	
	private String name;
	private int	viewers;
	
	public TVShow() {
		// TODO Auto-generated constructor stub
		super();
		this.setViewers(0);
	}
	
	public TVShow(Event e) {
		super(e);
		this.setName(null);
		this.setViewers(0);

	}
	
	public TVShow(TVShow tvs){
		
		super(tvs);
		this.setName(tvs.getName());
		this.setViewers(tvs.getViewers());
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getViewers() {
		return this.viewers;
	}

	public void setViewers(int v) {
		
		if (v > 0) {
			this.viewers = v;
		}
		
	}
	
	@Override
	public int impact() {
		// TODO Auto-generated method stub
		return (this.getViewers() + this.getAttendees()) * 2;
	}
	
	@Override
	public String toString() {
		return String.format("%s @ %s on %s\n%s\n(%d attending (%d))", 
				this.getArtist().getName(),
				this.getName(),
				this.getDate().toString(),
				this.getDescription(),
				this.getAttendees() + this.getViewers(),
				this.impact()
				);
	}
	
}//end of class
