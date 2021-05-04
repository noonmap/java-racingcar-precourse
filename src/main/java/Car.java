package main.java;

public class Car {
	private CarName name;
	private String progress;

	private void increaseProgress() {
		this.progress += "-";
	}
	
	public Car(String name) {
		this.name = new CarName(name);
		this.progress = "";
	}
	public String getName() {
		return name.getCarName();
	}
	public String getProgress() {
		return this.progress;
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
	}
	public void report() {
		System.out.println(getName() + " : " + getProgress());
	}

	public boolean matchProgress(Car anotherCar) {
		if(this.getProgress().length() == anotherCar.getProgress().length()) {
			return true;
		}
		return false;
	}
}
