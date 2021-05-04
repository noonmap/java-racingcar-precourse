package main.java;

public class MoveCountNumber {
	private static final int MIN_COUNT = 1;
	private static final int MAX_COUNT = 10;
	private static int count;

	public MoveCountNumber(int no) throws RuntimeException{
		validNo(no);
		this.count = no;
	}
	private void validNo(int no) throws RuntimeException{
		if(no < MIN_COUNT || no > MAX_COUNT) {
			throw new RuntimeException("이동 횟수는 10회 이내의 숫자여야 합니다.");
		}
	}
	public int getMoveCount() {
		return this.count;
	}
}
