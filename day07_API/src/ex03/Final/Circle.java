package ex03.Final;

public class Circle extends Point {

	int r;

	public void disp() {
		
		super.disp(); // point class toString() method call
		System.out.println("Circle [r=" + r + "]");
	}
}
