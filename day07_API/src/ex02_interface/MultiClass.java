package ex02_interface;

import ex01_interface.IDraw;
import ex01_interface.Shape;

public class MultiClass extends Shape 
							implements IDraw, Test {

	int num = 180711;
	
	@Override
	public void TestView() {
		System.out.println("Test Interface");
	}

	@Override
	public void draw() {
		System.out.println("IDraw Interface");
	}

	@Override
	public double cal(double x) {
		System.out.println("Shape abstract Class");
		return 5.6;
	}

	@Override
	public void show(String name) {
		System.out.println("Shape abstract Class");
	}

}
