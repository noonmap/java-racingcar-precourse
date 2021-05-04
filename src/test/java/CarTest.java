package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.Car;
import main.java.CarStatus;

class CarTest {
	private Car car;
	@BeforeEach
	void createCar() {
		car = new Car("test");
	}
	@Test
	@DisplayName("입력 숫자에 따른 CarStatus 검증")
	void 입력_숫자에_따른_CarStatus_검증() {
		assertEquals(car.getCarStatus(0), CarStatus.STOP);
		assertEquals(car.getCarStatus(3), CarStatus.STOP);
		assertEquals(car.getCarStatus(4), CarStatus.FORWARD);
		assertEquals(car.getCarStatus(9), CarStatus.FORWARD);
	}
	@Test
	@DisplayName("입력 숫자에 따른 play 검증")
	void 입력_숫자에_따른_play_검증() {
		String progress = car.getProgress();
		car.play(3);
		assertEquals(car.getProgress(), progress);
		car.play(4);
		assertEquals(car.getProgress(), progress + "-");
	}
}
