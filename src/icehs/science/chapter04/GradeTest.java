package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int score = 75;
		
		boolean a = (score <= 100) && (90 <= score);
		boolean b = (score <= 89) && (80 <= score);
		boolean c = (score <= 79) && (70 <= score);
		boolean d = (score <= 69) && (60 <= score);
		
		System.out.println("A학점 : " + a);
		System.out.println("B학점 : " + b);
		System.out.println("C학점 : " + c);
		System.out.println("D학점 : " + d);
	}

}
