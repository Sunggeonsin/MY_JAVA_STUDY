package icehs.science.chapter10;

public class Truck extends Car{
	
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
		System.out.println("트럭 최대 적재량 : " + maxWeight + " kg");
	}

	@Override
	public void go(int distance) {
		System.out.println("트럭를 타고 " + distance + "km 이동합니다.");
	}

}
