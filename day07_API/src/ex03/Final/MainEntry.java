package ex03.Final;

public class MainEntry {

	public static void main(String[] args) {
		new Point().disp();
		new Circle().disp();
		
		final int num = 2018; //final 변수는 반드시 초기화 하고 사용해야한다.
		System.out.println("num = " + num);
		
	//	num = 29; // final 변수는 값을 중간에 변경 할 수 없다. 
	}
}
