package main.java;

import java.util.ArrayList;
import java.util.Comparator;

public class Cars {
	private ArrayList<Car> cars;

	private void createCars(String[] names) {
		for(String name : names) {
			cars.add(new Car(name));
		}
	}
	
	private void validString(String aLine) throws RuntimeException{
		if(aLine.length() == 0) {
			throw new RuntimeException("자동차 이름을 적어도 1개 이상 적어야 합니다.");
		}
	}
	
	private int getRandomNumber() {
		double randomDoubleValue = Math.random();
		return (int)(randomDoubleValue * 10.0);
	}
	
	public Cars(String aStringLine) {
		validString(aStringLine);
		cars = new ArrayList<Car>();
		createCars( aStringLine.split(",") );
	}
	
	public int getCarNumber() {
		return this.cars.size();
	}

	public ArrayList<Car> getCars(){
		return this.cars;
	}

	public void sortCars() {
		cars.sort(new Comparator<Car>() {
			@Override
			public int compare(Car car1, Car car2) {
				return car1.getProgress().compareTo(car2.getProgress());
			}
		});
	}

	public String getWinners() {
		sortCars();
		Car maxProgressCar = cars.get((int)cars.size()-1);
		ArrayList<String> winnerList = new ArrayList<String>();
		for(Car car : cars) {
			addWinner(winnerList, maxProgressCar, car);
		}
		String winners = String.join(",", winnerList);
		return winners;
	}
	
	private void addWinner(ArrayList<String> winnerList, Car maxCar, Car car) {
		if(car.matchProgress(maxCar) == true) {
			winnerList.add(car.getName());
		}
		
	}

	public void play() {
		for(Car car : this.cars) {
			car.play(getRandomNumber());
		}
	}
	
	public void report() {
		for(Car car : this.cars) {
			car.report();
		}
		System.out.print('\n');
	}
	
}
