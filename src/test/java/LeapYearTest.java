import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void theYear2001IsNotALeapYear() {
		assertThat(LeapYear.isLeapYear(2001), is(false));
	}

	@Test
	public void theYear1996IsALeapYear() {
		assertThat(LeapYear.isLeapYear(1996), is(true));
	}

	@Test
	public void theYear1900IsNotALeapYear() {
		assertThat(LeapYear.isLeapYear(1900), is(false));
	}

	@Test
	public void theYear2000IsALeapYear() {
		assertThat(LeapYear.isLeapYear(2000), is(true));
	}

}
