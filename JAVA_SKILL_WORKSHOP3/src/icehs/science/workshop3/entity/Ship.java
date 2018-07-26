package icehs.science.workshop3.entity;

public class Ship {
	public String modelName;
	public int maxSpeed;
	public int numberLimit;
	public int replacement;
	public boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모델명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 배수량: " + replacement + "톤");
	}
}
