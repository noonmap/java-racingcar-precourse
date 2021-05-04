package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.MoveCountNumber;

class MoveCountNumberTest {

	@Test
	@DisplayName("MoveCountNumber 검증")
	void validateMoveCountNumber() {
		assertFalse(new MoveCountNumber(0).validNo());
		assertTrue(new MoveCountNumber(1).validNo());
		assertTrue(new MoveCountNumber(10).validNo());
		assertFalse(new MoveCountNumber(11).validNo());
	}
}
