package main.java;

public class Car {
	private String name;
	private String progress;
	
	private void report() {
		System.out.println(getName() + " : " + getProgress());
	}
	
	public Car(String name) {
		this.name = name;
		this.progress = "";
	}
	public String getName() {
		return this.name;
	}
	public String getProgress() {
		return this.progress;
	}
	public void increaseProgress() {
		this.progress += "-";
	}
	public CarStatus getCarStatus(int no) {
		if(no <= 3) {
			return CarStatus.STOP;
		}
		return CarStatus.FORWARD;
	}
	public void play(int no) {
		if(getCarStatus(no) == CarStatus.FORWARD) {
			increaseProgress();
		}
		report();
	}
}
