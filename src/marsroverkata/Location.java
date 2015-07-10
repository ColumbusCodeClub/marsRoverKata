package marsroverkata;

public class Location {

	
	private int x;
	private int y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Location() {
	}

	@Override
	public boolean equals(Object o) {
		
		if (o instanceof Location) {
			return ((Location) o).x == x && ((Location) o).y == y;	
		} else {
			return false;
		}
	}

	public int x() {
		return x;
	}

	public int y() {
		return y;
	}
	
}
