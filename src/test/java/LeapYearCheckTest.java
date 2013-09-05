import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class LeapYearCheckTest {

	private LeapYearCheck fLeapYearCheck;

	@Before
	public void setUp() throws Exception {
		fLeapYearCheck = new LeapYearCheck();
	}

	@Test public void
	yearNotDivisibleBy4IsNotALeapYear() {
		assertThat(fLeapYearCheck.isLeapYear(1995), is(false));
	}

	@Test public void
	yearDivisibleBy4IsALeapYear() {
		assertThat(fLeapYearCheck.isLeapYear(1996), is(true));
	}

	@Test public void
	yearDivisibleBy100IsNotALeapYear() {
		assertThat(fLeapYearCheck.isLeapYear(1900), is(false));
	}

	@Test public void
	yearDivisibleBy400IsALeapYear() {
		assertThat(fLeapYearCheck.isLeapYear(2000), is(true));
	}

	@Test(expected=IllegalArgumentException.class) public void
	yearLessThan1ThrowsIAE() {
		fLeapYearCheck.isLeapYear(0);
	}




}
