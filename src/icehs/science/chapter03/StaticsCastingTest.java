package icehs.science.chapter03;

public class StaticsCastingTest {

	public static void main(String[] args) {
		double lotto = 1.235E-7;
		long population = 6973738433L;
		
		int intlotto = (int)lotto;	
		int intpopulation = (int)population;
				
		
		
		System.out.println("로또에 당첨될 확률 : " + lotto);
		System.out.println("로또에 당첨될 확률 int 변환 : " + intlotto);
		System.out.println("전 세계의 인구 수 : " + population);
		System.out.println("전 세계의 인구 수 int 변환 : " + intpopulation);

	}

}
