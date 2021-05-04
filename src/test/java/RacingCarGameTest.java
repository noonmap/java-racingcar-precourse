package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.RacingCarGame;

class RacingCarGameTest {

	@Test
	@DisplayName("정상적인 입력 검증")
	void 정상적인_입력_검증() {
        String input = "aaa,bbb,ccc\n5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertAll(()->{
            new RacingCarGame();
        });
	}
}
