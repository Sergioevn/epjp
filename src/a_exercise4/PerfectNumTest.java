package a_exercise4;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PerfectNumTest {
	@Test
	void isPerfectTrue() {
		assertThat(PerfectNum.isPerfect(6), is("Perfect"));
	}

	@Test
	void isAbundantTrue() {
		assertThat(PerfectNum.isPerfect(7), is("Abundant"));
	}

	@Test
	void isDefectiveTrue() {
		assertThat(PerfectNum.isPerfect(2100), is("Defective"));
	}
	@Test
	void perfectnumIllArgExc() {
		assertThrows(IllegalArgumentException.class, () -> PerfectNum.isPerfect(-1));
}
	
}