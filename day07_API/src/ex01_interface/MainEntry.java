package ex01_interface;

public class MainEntry {
	public static void main(String[] args) {
		// 1. �ڱ��ڽ����� ��ü ����
		Bus bus = new Bus();
		bus.move();
		bus.stop();
		System.out.println(" ------------���� -------------");
		// 2. �θ�κ��� ��ü ����
		Tran tra = new Bus();
		tra.move();
		tra.stop();
	}
}
