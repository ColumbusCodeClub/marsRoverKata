package marsroverkata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import org.junit.Test;


public class LocationTest {

	private Location other = new Location(5, 5);

	@Test
	public void shouldNotBeEqualToNonLocationObject() {
		Object objectThatIsNotALocation = new Object();
		Location underTest = new Location(5, 5);
		
		assertThat(underTest, not(equalTo(objectThatIsNotALocation)));
	}
	
	@Test
	public void shouldBeEqualToAnotherLocationWithSameCoordinates() {
		Location underTest = new Location(5, 5);
		
		assertThat(underTest, is(other));
	}
	
	@Test
	public void shouldNotBeEqualToAnotherLocationIfTheXCoordinateIsDifferent() {
		Location underTest = new Location(4, 5);
		
		assertThat(underTest, is(not(other)));
	}
	
	@Test
	public void shouldNotBeEqualToAnotherLocationIfTheYCoordinateIsDifferent() {
		Location underTest = new Location(5, 4);
		
		assertThat(underTest, is(not(other)));
	}
	
	@Test
	public void shouldReturnXValue() {
		Location underTest =  new Location(5, 5);
		
		assertThat(underTest.x(), is(5));
	}
	
	@Test
	public void shouldReturnYValue() {
		Location underTest = new Location(5, 4);
		
		assertThat(underTest.y(), is(4));
	}
	
	@Test
	public void defaultXShouldBe0() {
		Location underTest = new Location();
		
		assertThat(underTest.x(), is(0));
	}
	
	@Test
	public void defaultYShouldBe0() {
		Location underTest = new Location();
		
		assertThat(underTest.y(), is(0));
	}
}
