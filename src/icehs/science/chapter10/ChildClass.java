package icehs.science.chapter10;

public class ChildClass extends SuperClass implements InterfaceOne, InterfaceTwo{

	@Override
	public void methodTwo() {
		System.out.println("인터페이스 2에서 구현해야 하는 메서드");
		
	}

	@Override
	public void methodFirst() {
		System.out.println("인터페이스 1에서 구현해야 하는 메서드");
		
	}

}
