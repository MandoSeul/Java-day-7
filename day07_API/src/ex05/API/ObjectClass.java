package ex05.API;

class Point { }
public class ObjectClass {
	public static void main(String[] args) {
	Point pt = new Point();
	System.out.println("Point po's information");
	System.out.println("class name : " + pt.getClass());
	System.out.println("hash code : "+pt.hashCode()); //366712642 ( mem���� � ��ġ )->10������ ��Ÿ��
	System.out.println("Object String : " + pt.toString());
	System.out.println("Object String : "+pt);
	System.out.printf("10���� ��ȯ  : %d ",0x15db9742); //16���� -> 10����
		
	System.out.println("-----------����-------------");
	Point pt2 = new Point();
	System.out.println("Point po's information");
	System.out.println("class name : " + pt2.getClass());
	System.out.println("hash code : "+pt2.hashCode()); //366712642 ( mem���� � ��ġ )->10������ ��Ÿ��
	System.out.println("Object String : " + pt2.toString());
	System.out.println("Object String : "+pt2);
	
	System.out.println("pt2.toString() : toString()�� �ǹ�");
	System.out.println(pt2.getClass().getName() + '@'+Integer.toHexString(pt2.hashCode()));
	
	Point pt3 = new Point();
	//��ü����, �޸𸮿� �Ҵ�, ������ �Լ� �ڵ� ȣ���
	if(pt.hashCode()==pt3.hashCode()){
		System.out.println("same");
	}else{
		System.out.println("diff");
	}
	
	Point pt4; // ����
	pt4 = pt; // ?
	
	if(pt.hashCode()==pt4.hashCode()){
		System.out.println("same");
	}else{
		System.out.println("diff");
	}
	//hashcode 
}
}
