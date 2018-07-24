package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sumOdd = 0;
		int sumEven = 0;
		int i;
		for(i = 0; i <= 1000; i++) {
			if(i % 2 == 0) {
				sumOdd += i;
			}
			else {
				sumEven += i;
			}
		}
		System.out.println("1부터 1000까지의 합 : " + (sumOdd + sumEven) );
		System.out.println("1부터 1000까지 짝수의 합 : " + sumOdd);
		System.out.println("1부터 1000까지 홀수의 합 : " + sumEven);
	}

}
