package icehs.science.chapter07;

public class Book {
	private String title;
	private String author;
	int price;
	
	Book(){
		
	}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
		
	}
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	void printBookInfo() {
		System.out.println("å ���� : " + this.title);
		System.out.println("�۰��� : " + this.author);
		System.out.println("���� : " + this.price);
	}

}
