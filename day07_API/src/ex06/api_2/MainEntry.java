package ex06.api_2;

import java.awt.Point;

public class MainEntry {
	public static void main(String[] args) {
		int x =999;
		String str = "Abc";
		System.out.println("str : " + str);
		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2));
		
		char []data = {'a','b','c'};
		str = new String(data);
		System.out.println("str : " +str);
		System.out.println("kbs");
		
		String msg = "dekjfeklsenklf";
		System.out.println("korea"+msg);//korea dekjfeklsenfklf
		System.out.println(msg);
		System.out.println("====================");
		
		String str2 = "abcdef".substring(2);
		System.out.println(str2);
		
		str2 = "abcdef".substring(2, 5);
		System.out.println(str2);

		System.out.println(msg + ":" + str2);
		
		System.out.println("====================");
		
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println("p1.hashCode() : "+p1.hashCode());
		System.out.println("p2.hashCode() : "+p2.hashCode());
		
		System.out.println("====================");
		//kosta�� ���Ƽ� kosta��� ������ �Ҵ�Ǹ� s1�� s2�� ���� ������ ����Ŵ.
		// �� ���Ŀ� s1�� ���� �ٲ��ָ� s2�� �����ϰ� s1�� �޶���.
		String s1 = new String("kosta");
		String s2 = new String("kosta"); // string������ ���� �� ����Ŵ
		System.out.println("s1.hashCode() : " + s1.hashCode());
		System.out.println("s2.hashCode() : " + s2.hashCode());
				
	}
}
