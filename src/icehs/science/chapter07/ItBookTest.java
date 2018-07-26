package icehs.science.chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook book1 = new ItBook("SQL Plus", 50000, 5.5);
		ItBook book2 = new ItBook("Java 2,0", 28000, 3.2);
		ItBook book3 = new ItBook("JSP Servlet", 37000, 6.9);
		
		book1.printItBookInfo();
		book2.printItBookInfo();
		book3.printItBookInfo();
		
		System.out.println();

		System.out.println(book1.getTitle() + " 정가와 할인율을 변경합니다.");
		book1.setPrice(55000);
		book1.setDiscountRate(9.5);
		book1.printItBookInfo();
		
		System.out.println();
		
		System.out.println(book2.getTitle() + " 정가를 변경합니다.");
		book2.setPrice(33000);
		book2.printItBookInfo();
		
		System.out.println();
		
	
		System.out.println(book3.getTitle() + " 제목과 할인율을 변경합니다.");
		book3.setTitle("Servlet & JSP");
		book3.setDiscountRate(12.6);
		book3.printItBookInfo();
	
	
	
	
	
	
	
	}

}
