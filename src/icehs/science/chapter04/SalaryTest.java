package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int msalary = 1000000;
		int bonus = msalary * 4 * 20 / 100;
		int mtax = msalary * 10 / 100;
		int tax = mtax * 12;
		int bonusTax = bonus * 55 / 1000;
		int salary = msalary * 12;
		int income = salary - tax + bonus - bonusTax;
		
		System.out.println("연봉 : " + salary);
		System.out.println("세후 연봉 : " + (salary - tax));
		System.out.println("보너스 : " + bonus);
		System.out.println("세후 보너스 : " + (bonus - bonusTax));
		System.out.println("지급액 : " + income);

	}

}
