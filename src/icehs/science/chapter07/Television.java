package icehs.science.chapter07;

public class Television {
	String name;
	String description;
	int price;
	public Television(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Television(String name, int price , String description) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	void printTelevisionInfo() {
		if(description == null) {
			System.out.println(name + " : " + price);
		}else {
			System.out.println(name + " ( " + description + " ) " + " : " + price);
		}
	}
	
	

}
