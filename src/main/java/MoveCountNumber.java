package main.java;

public class MoveCountNumber {
	private static final int MIN_COUNT = 1;
	private static final int MAX_COUNT = 10;
	private static int count;

	public MoveCountNumber(int no){
		this.count = no;
	}
	public boolean validNo() {
		return this.count >= MIN_COUNT && this.count <= MAX_COUNT;
	}
}
