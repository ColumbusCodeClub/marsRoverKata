package marsroverkata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;

public class RoverTest {
	Rover rover = new Rover();

	Location location = new Location();
	
	@Test
	public void shouldBeARover() {
		assertThat(rover, is(notNullValue(Rover.class)));
	}
	
	@Test
	public void locationShouldReturnNewLocation() {
		assertThat(rover.getLocation(), is(notNullValue(Location.class)));
	}
	
	@Test
	public void shouldReturnCurrentLocation() {
		rover = new Rover(location);
		
		assertThat(rover.getLocation(), is(location));
	}
	
	@Test
	public void shouldHaveCoordinatesOfInitialLocation() {
		rover = new Rover(new Location(1, 1));
		
		assertThat(rover.getLocation(), is(new Location(1, 1)));
	}
	
	
	@Test
	public void shouldInitializeXLocationToZero() {
		assertThat(rover.getLocation().x(), is(0));
	}
	
	@Test
	public void shouldInitializeYLocationToZero() {
		assertThat(rover.getLocation().y(), is(0));
	}
}
