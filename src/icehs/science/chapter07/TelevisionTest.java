package icehs.science.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television name1 = new Television("INFINIA",1500000);
		name1.printTelevisionInfo();
		
		Television name2 = new Television("XCANVAS" , 1000000 , "LCD TV");
		name2.printTelevisionInfo();
		
		Television name3 = new Television("CINEMA" , 2000000 , "3D TV");
		name3.printTelevisionInfo();
		
		System.out.println("가격의 합 : " + (name1.price + name2.price + name3.price));
		

	}

}
