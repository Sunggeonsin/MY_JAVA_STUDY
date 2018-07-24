package icehs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int dongscore = 92;
		int sunscore = 85;
		
		if(dongscore>=90 && dongscore <= 100){
			System.out.println("홍길동 : A학점 입니다.");
		}
		else {
			System.out.println("홍길동 : A학점을 받지 못했습니다.");
		}

		if(sunscore>=90 && sunscore <= 100) {
			System.out.println("홍길순 : A학점 입니다.");
		}
		else {
			System.out.println("홍길순 : A학점을 받지 못했습니다.");
		}
	}

}

