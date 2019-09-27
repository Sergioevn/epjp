package a_pangram;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class junit {
	@Test
	void isPangramTrue() {
		assertThat(Pangram.isPangram("Two driven jocks help fax my big quiz."), is(true));
	}

	@Test
	void isPangramFalse() {
		assertThat(Pangram.isPangram("Two driven jocks help fax my big qui."), is(false));
	}

	@Test
	void isPangramOddChar() {
		assertThat(Pangram.isPangram("Two driven jocks help fax my big quiz#°."), is(true));
	}

}