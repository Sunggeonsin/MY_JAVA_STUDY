package icehs.science.chapter04;

public class SeperatrNumberTest {

	public static void main(String[] args) {
		int num = 456;
		int hundNumber = num / 100;
		int tenNumber = (num % 100) / 10;
		int oneNumber = ( num % 100 ) % 10;
		
		System.out.println("숫자 : " + num);
		System.out.println("백의 자리 수 : " + hundNumber);
		System.out.println("십의 자리 수 : " + tenNumber);
		System.out.println("일의 자리 수 : " + oneNumber);
	}

}
