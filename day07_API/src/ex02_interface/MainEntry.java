package ex02_interface;

import ex01_interface.Shape;

public class MainEntry {
	public static void main(String[] args) {
		//1. �ڱ��ڽ����� ��ü ����
		MultiClass mc = new MultiClass();
		mc.TestView();
		mc.draw();
		System.out.println("-----------����-------------");
		//2. �θ�� ��ü ���� - shape, idraw, test
		Test t = new MultiClass();
		t.TestView();
		System.out.println(t.str);
		System.out.println("-----------����-------------");
		Shape s = new MultiClass();
		s.view();
		System.out.println(s.cal(8.7));
	}
}
