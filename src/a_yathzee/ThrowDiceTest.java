package a_yathzee;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class ThrowDiceTest {

	@Test
	void yathzeeThreeOf() {
		int[] array = { 1, 1, 1, 1, 1 };
		assertThat(ThrowDice.yathzee(array, Chances.THREES), is(3));
	}

	@Test
	void yathzeeFourOf() {
		int[] array = { 1, 1, 1, 1, 1 };
		assertThat(ThrowDice.yathzee(array, Chances.FOUR), is(4));

	}

	@Test
	void yathzeeFourOfBigger() {
		int[] array = { 1, 5, 5, 5, 5 };
		assertThat(ThrowDice.yathzee(array, Chances.FOUR), is(4));

	}
	@Test
	void yathzeeFive() {
		int[] array = { 5, 5, 5, 5, 5 };
		assertThat(ThrowDice.yathzee(array, Chances.FIVE), is(50));

	}
	
	@Test
	void yathzeeFull() {
		int[] array = { 5, 5, 4, 5, 4 };
		assertThat(ThrowDice.yathzee(array, Chances.FULL), is(25));
}}
