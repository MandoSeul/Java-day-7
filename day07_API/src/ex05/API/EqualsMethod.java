package ex05.API;

class Circle{
	int x,y;
}
public class EqualsMethod {
	public static void main(String[] args) {
	
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		System.out.println("C1 : " + c1.hashCode());
		System.out.println("C2 : " + c2.hashCode());
		
		if(c1==c2){
			System.out.println("same");
		}else{
			System.out.println("diff");
		}
		
		int x=4, y=4;
		System.out.println("�⺻ �ڷ��� ��");
		if(x == y) System.out.println("same");
		else System.out.println("diff");
		
		System.out.println("���� �ڷ��� ��");
		String str1 = new String("korea~");
		String str2 = new String("korea~");
		// ���� �ڷ����� �ּҸ� ���� �ֱ⶧���� �ּҸ� ���Ѱ� - > different
		if(str1 == str2) System.out.println("same");
		else System.out.println("diff");
		//equlas : �빮�� �ҹ��� ���ؼ� ��
		//equalsignoreCase : �� ���� ��
		
		//���ڸ� ���ϰ� ������ equal �̿��ϱ�
		
		System.out.println("------------equlas method ��----------");
		if(str1.equals(str2)) System.out.println("same");
		else System.out.println("diff");
		
	}
	
	
}
