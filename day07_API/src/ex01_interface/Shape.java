package ex01_interface;

public abstract class Shape {
	double result = 0;
	public abstract double cal(double x);
	public abstract void show(String name);
	
	public void view() {
		System.out.println("Super class Shape ¿‘¥œ¥Ÿ. ");
	}
}
