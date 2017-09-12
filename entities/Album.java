package bwi.prog2B.SS2017.wi16b027_Can.ExerciseSheet05.entities;

public class Album extends Release {

	private class TrackListItem {

		private TrackListItem next;
		private Track track;

		public TrackListItem(Track t) {
			this.track = t;
			this.next = null;
		}
	}// end of class TrackListItem

	private TrackListItem trackListHead;

	public Album() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Album(Album orig) {
		// TODO Auto-generated constructor stub
		super(orig);
	}

	public Album(String title, Artist artist, int year) {

		super(title, artist, year);
	}

	public boolean addTrack(Track t) {

		if (t == null) {
			return false;
		}

		TrackListItem header = this.trackListHead;

		if (header == null) {
			this.trackListHead = new TrackListItem(t);
			return true;
		}

		while (header.next != null) {
			header = header.next;
		}
		header.next = new TrackListItem(t);
		return true;
	}

	public int nrTracks() {

		int count = 0;
		for (TrackListItem n = trackListHead; n != null; n = n.next) {
			count++;
		}
		return count;
	}

	public Track[] getTracks() {

		if (this.nrTracks() == 0) {

			Track[] empty = new Track[0];
			return empty;
		}

		Track[] temp = new Track[this.nrTracks()];
		TrackListItem node = this.trackListHead;
		int x = 0;

		while (x < this.nrTracks()) {

			temp[x] = node.track;
			node = node.next;
			x++;
		}
		return temp;
	}

	public Track removeTrack(int n) {

		int length = this.nrTracks();

		if (n > length - 1) {
			return null;
		}

		TrackListItem node = this.trackListHead;
		TrackListItem before = new TrackListItem(null);
		Track ret = null;
		int i = 0;

		// If the first element is deleted
		// We set the 2nd element as trackListHead
		if (n == 0) {
			ret = node.track;
			this.trackListHead = node.next;
			return ret;
		}

		// If the last element is deleted,
		// we go through the list and set
		// next of the second last element to null.
		if (n == length - 1) {
			while (i < length - 2) {
				node = node.next;
				i++;
			}
			ret = node.next.track;
			node.next = null;
			return ret;
		}

		// If it's neither first or last we link
		// the elements before and after the deleted node
		while (i < n + 1) {
			node = node.next;
			i++;
			if (i == n - 1) {
				before = node;
			} else if (i == n) {
				ret = node.track;
			}
		}

		before.next = node;
		return ret;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String ret = "\n[";

		for (TrackListItem n = trackListHead; n != null; n = n.next) {
			ret += "[" + n.track.getTitle() + "]";
		}
		ret += "]";
		return super.toString() + ret;
	}

	@Override
	public int totalTime() {
		// TODO Auto-generated method stub
		int count = 0;
		for (TrackListItem n = trackListHead; n != null; n = n.next) {
			count += n.track.getDuration();
		}
		return count;
	}

}
