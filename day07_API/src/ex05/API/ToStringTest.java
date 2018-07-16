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
		System.out.println(rec); // toString override 해서 사용 가능
		//rec=rec.toString 같은 것 바로 앞의 예제에서 봄
	}
}
