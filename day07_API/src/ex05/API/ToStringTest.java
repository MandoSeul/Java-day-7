package ex05.API;

class Rectangle{
	int x, y;
	/*public void disp(){
		System.out.println(x +","+y);
	}*/

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
}
public class ToStringTest {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		//rec.disp();
		System.out.println(rec); // toString override �ؼ� ��� ����
		//rec=rec.toString ���� �� �ٷ� ���� �������� ��
	}
}
