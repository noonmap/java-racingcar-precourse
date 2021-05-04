package main.java;

import java.io.IOException;
import java.util.Scanner;

public class RacingCarGame {
	private Cars cars;
	private MoveCountNumber moveCount;
	Scanner scanner;
	
	private void createCars() throws IOException{
		System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉽표(,) 기준으로 구분)");
		cars = new Cars(scanner.nextLine());
	}
	private void createMoveCountNumber() throws IOException{
		System.out.println("시도할 회수는 몇회인가요?");
		moveCount = new MoveCountNumber(scanner.nextInt());
	}
	public RacingCarGame() throws IOException {
		scanner = new Scanner(System.in);
		createCars();
		createMoveCountNumber();
		scanner.close();
	}

	public void playRacingCarGame() {
		System.out.print("\n실행 결과\n");
		for(int cnt=0; cnt<moveCount.getMoveCount(); cnt++) {
			cars.play();
			cars.report();
		}
	}
	public void printResult() {
		System.out.println( cars.getWinners() + "가 최종 우승했습니다.");
	}
}
