package icehs.science.chapter06;

public class Car {
	
	public String name = "ICEī";
	int oilAmount;
	double distance;
	
	void driveCar (String start,String end,double driveDistance) {
		distance += driveDistance;
		oilAmount -= (driveDistance / 20);
		System.out.println(start + "���� " + end + "���� " + driveDistance + "km �����Ͽ����ϴ�.");
	}
	
	void addOil(int oil) {
		oilAmount += oil;
		System.out.println("�ֹ��� " + oil + "L ��ŭ�� �����մϴ�.");
	}
	
	void calculateDriveDistance() {
		System.out.println("���� ������ �Ÿ��� �� " + (double)oilAmount * 20 + "km �Դϴ�.");
	}
	
	void printCarInfo() {
		System.out.println("[" + name + "~] ���� �⸧�� �� : " + oilAmount + "L, �� ����Ÿ� : " + distance + "km");
	}
}
