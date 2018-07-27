package icehs.science.chapter10;

public class Iphone extends Moblie {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println(super.getProduction() + " : " + color);
	}
	
	@Override
	public void charge(int time) {
		System.out.println(this.getProduction() + " : " + time + "분 충전했더니 Full!");
	}

}
