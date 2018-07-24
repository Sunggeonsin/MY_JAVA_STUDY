package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int num = 64;
		boolean isOdd = (num % 2) == 0;
		boolean isMultiOf3 = (num / 3) == 0;
		boolean isMultiOf2And7 = (num % 2 == 0) && (num % 7 == 0);
		boolean isMultiOf2Or7 = (num % 2 == 0) || (num % 7 == 0);
		
		System.out.println("짝수입니까? : " + isOdd);
		System.out.println("3의 배수입니까? : " + isMultiOf3);
		System.out.println("2의 배수이면서 7의 배수입니까? : " + isMultiOf2And7);
		System.out.println("2의 배우이거나 7의 배수입니까? : " + isMultiOf2Or7);

	}

}
