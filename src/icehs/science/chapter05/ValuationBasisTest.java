package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 40;
		int num4 = 50;
		int num5 = 80;
		
		 double result1 = (double)((num1 * num2) / 2) * 60 / 100;
		 double result2 = (double)((num3 + num4) / 2) * 13 / 100;
		 double result3 = (double)num5 * 27 / 100;
		 
		 double resultAll = result1 + result2 + result3;
		 
		 double score = resultAll;
		 
		 System.out.println("평가 점수 : " + resultAll);
		 
		 if(score <= 100 && score >= 95) {
			 System.out.println("Special Class입니다.");
		 } else if(score < 95 && score >= 90) {
			 System.out.println("Gold Class입니다.");
		 } else if(score < 90 && score >= 85) {
			 System.out.println("Silver Class입니다.");
		 } else if(score < 85 && score >= 80) {
			 System.out.println("Bronze Class입니다.");
		 }else {
			 System.out.println("Member입니다.");
		 }
		 
		 

	}

}
