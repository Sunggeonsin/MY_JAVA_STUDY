package icehs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 7;
		
		int addResult = num1 + num2;
		int subtractResult = num1 - num2;
		int multiplyResult = num1 * num2;
		int divideResult = num1 / num2;
		int remainderResult = num1 % num2;
		
		
		System.out.println("덧셈 결과 : " + addResult);
		System.out.println("뺄셈 결과 : " + subtractResult);
		System.out.println("곱셈 결과 : " + multiplyResult);
		System.out.println("나눗셈 결과 :" + divideResult);
		System.out.println("나머지 : " + remainderResult);
		
	}

}
