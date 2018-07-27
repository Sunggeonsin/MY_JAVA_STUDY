package icehs.science.chapter10;

public class MoblieTest {

	public static void main(String[] args) {
		Moblie [] phone = { new Galaxy(), new Iphone() };
		phone[0].setProduction("Galaxy");
		((Galaxy)phone[0]).setOsVersion("안드로이드 오레오");
		phone[0].call(5);
		phone[0].charge(30);
		
		phone[1].setProduction("Iphone");
		((Iphone)phone[1]).setColor("흰색");
		phone[1].call(10);
		phone[1].charge(15);
	}

}
