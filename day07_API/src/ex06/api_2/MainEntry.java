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
		//kosta가 같아서 kosta라는 공간이 할당되면 s1과 s2는 같은 공간을 가리킴.
		// 그 이후에 s1의 값을 바꿔주면 s2는 유지하고 s1만 달라짐.
		String s1 = new String("kosta");
		String s2 = new String("kosta"); // string같으면 같은 곳 가리킴
		System.out.println("s1.hashCode() : " + s1.hashCode());
		System.out.println("s2.hashCode() : " + s2.hashCode());
				
	}
}
