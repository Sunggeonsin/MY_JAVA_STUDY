package icehs.science.workshop3.entity;

public class Car {
	public String modelName;
	public int maxSpeed;
	public int numberLimit;
	public int mileage;
	public boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모델명 : " + modelName);
		System.out.println(" 최대속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 평균연비: " + mileage + "km/l");
	}
}
