package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.MoveCountNumber;

class MoveCountNumberTest {
	@Test
	@DisplayName("MoveCountNumber 검증")
	void validateMoveCountNumber() {
		assertAll(()->{
			new MoveCountNumber(1);
			new MoveCountNumber(10);
		});
		assertThrows(RuntimeException.class, ()->{
			new MoveCountNumber(0);
		});
		assertThrows(RuntimeException.class, ()->{
			new MoveCountNumber(11);
		});
	}
}
