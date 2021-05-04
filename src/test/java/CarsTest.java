package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.Car;
import main.java.Cars;

class CarsTest {

	@Test
	@DisplayName("입력 문자열 길이에 따른 Cars 생성자 예외 검증")
	void 입력_문자열_길이에_따른_Cars_생성자_예외_검증() {
		assertAll(()->{
			new Cars("aaa");
			new Cars("a,bb,ccc,dddd,eeeee");
		});
		assertThrows(RuntimeException.class, ()->{
			new Cars("aaaaaa");
		});
		assertThrows(RuntimeException.class, ()->{
			new Cars("");
		});
	}
	@Test
	@DisplayName("입력 문자열 분리자에 따른 자동차 개수 검증")
	void 입력_문자열_분리자에_따른_자동차_개수_검증() {
		Cars cars = new Cars("a,bb,ccc,dddd,eeeee");
		assertEquals(cars.getCarNumber(), 5);
	}
	@Test
	@DisplayName("자동차 정렬 검증")
	void 자동차_정렬_검증() {
		Cars cars = new Cars("a,b,c");
		cars.play();
		cars.sortCars();
		ArrayList<Car> sorting = cars.getCars();
		assertTrue(sorting.get(0).getProgress().compareTo(
				sorting.get(1).getProgress()) <= 0);
		assertTrue(sorting.get(1).getProgress().compareTo(
				sorting.get(2).getProgress()) <= 0);
	}
}
