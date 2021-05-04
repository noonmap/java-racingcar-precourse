package main.java;

public class CarName {
	private static final int MIN_NAME_LEN = 1;
	private static final int MAX_NAME_LEN = 5;
	
	private String name;
	
	public CarName(String name) throws RuntimeException{
		validName(name);
		this.name = name;
	}
	public void validName(String name) throws RuntimeException{
		if(name.length() < MIN_NAME_LEN || name.length() > MAX_NAME_LEN) {
			throw new RuntimeException("자동차의 이름은 5자 이내여야 합니다.");
		}				
	}
	public String getCarName() {
		return this.name;
	}
}
