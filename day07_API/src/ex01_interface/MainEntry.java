package ex01_interface;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 자기자신으로 객체 생성
		Bus bus = new Bus();
		bus.move();
		bus.stop();
		System.out.println(" ------------구별 -------------");
		// 2. 부모로부터 객체 생성
		Tran tra = new Bus();
		tra.move();
		tra.stop();
	}
}
