package ex03.Final;

public class MainEntry {

	public static void main(String[] args) {
		new Point().disp();
		new Circle().disp();
		
		final int num = 2018; //final ������ �ݵ�� �ʱ�ȭ �ϰ� ����ؾ��Ѵ�.
		System.out.println("num = " + num);
		
	//	num = 29; // final ������ ���� �߰��� ���� �� �� ����. 
	}
}
