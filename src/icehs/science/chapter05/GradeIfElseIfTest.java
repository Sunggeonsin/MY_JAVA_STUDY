package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int score = 92;
		
		if(score <= 100 && score >= 90) {
			System.out.println("A학점 입니다.");
		} else if(score < 90 && score >=80) {
			System.out.println("B학점 입니다.");
		} else if(score < 80 && score >=79) {
			System.out.println("C학점 입니다.");
		} else if(score < 70 && score >= 69) {
			System.out.println("D학점 입니다.");
		} else if(score < 60 && score >=0){
			System.out.println("F학점 입니다.");
		}
		else {
			System.out.println("학점을 알 수가 없습니다. 점수를 잘못입력하셨습니다.");
		}

	}

}
