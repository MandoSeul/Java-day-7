package ex05.API;

class Point { }
public class ObjectClass {
	public static void main(String[] args) {
	Point pt = new Point();
	System.out.println("Point po's information");
	System.out.println("class name : " + pt.getClass());
	System.out.println("hash code : "+pt.hashCode()); //366712642 ( mem상의 어떤 위치 )->10진수로 나타냄
	System.out.println("Object String : " + pt.toString());
	System.out.println("Object String : "+pt);
	System.out.printf("10진수 변환  : %d ",0x15db9742); //16진수 -> 10진법
		
	System.out.println("-----------구별-------------");
	Point pt2 = new Point();
	System.out.println("Point po's information");
	System.out.println("class name : " + pt2.getClass());
	System.out.println("hash code : "+pt2.hashCode()); //366712642 ( mem상의 어떤 위치 )->10진수로 나타냄
	System.out.println("Object String : " + pt2.toString());
	System.out.println("Object String : "+pt2);
	
	System.out.println("pt2.toString() : toString()의 의미");
	System.out.println(pt2.getClass().getName() + '@'+Integer.toHexString(pt2.hashCode()));
	
	Point pt3 = new Point();
	//객체생성, 메모리에 할당, 생성자 함수 자동 호출됨
	if(pt.hashCode()==pt3.hashCode()){
		System.out.println("same");
	}else{
		System.out.println("diff");
	}
	
	Point pt4; // 선언
	pt4 = pt; // ?
	
	if(pt.hashCode()==pt4.hashCode()){
		System.out.println("same");
	}else{
		System.out.println("diff");
	}
	//hashcode 
}
}
