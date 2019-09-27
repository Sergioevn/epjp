package a_exercise3;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class junit {
	@Test
	void hammingIs0() {
		assertThat(Hamming.hamming("100100", "100100"), is(0));
	}

	@Test
	void hammingIs1() {
		assertThat(Hamming.hamming("120100", "100100"), is(1));
	}

	@Test
	void hammingIllArgExc() {
		assertThrows(IllegalArgumentException.class, () -> Hamming.hamming("1001001", "100100"));
	}

	@Test
	void hammingNullPntExc() {
		assertThrows(NullPointerException.class, () -> Hamming.hamming(null, null));
	}

	@Test
	void hammingNullPntExcEmpty() {
		assertThrows(NullPointerException.class, () -> Hamming.hamming("", ""));
	}

	@Test
	void hammingSpace() {
		assertThat(Hamming.hamming("120 100", "100 100"), is(1));
	}
}