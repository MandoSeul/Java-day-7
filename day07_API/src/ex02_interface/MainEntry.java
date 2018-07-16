package ex02_interface;

import ex01_interface.Shape;

public class MainEntry {
	public static void main(String[] args) {
		//1. 자기자신으로 객체 생성
		MultiClass mc = new MultiClass();
		mc.TestView();
		mc.draw();
		System.out.println("-----------구별-------------");
		//2. 부모로 객체 생성 - shape, idraw, test
		Test t = new MultiClass();
		t.TestView();
		System.out.println(t.str);
		System.out.println("-----------구별-------------");
		Shape s = new MultiClass();
		s.view();
		System.out.println(s.cal(8.7));
	}
}
