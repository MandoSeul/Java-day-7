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
		System.out.println("기본 자료형 비교");
		if(x == y) System.out.println("same");
		else System.out.println("diff");
		
		System.out.println("참조 자료형 비교");
		String str1 = new String("korea~");
		String str2 = new String("korea~");
		// 참조 자료형은 주소를 갖고 있기때문에 주소를 비교한것 - > different
		if(str1 == str2) System.out.println("same");
		else System.out.println("diff");
		//equlas : 대문자 소문자 비교해서 비교
		//equalsignoreCase : 비교 없이 비교
		
		//글자를 비교하고 싶으면 equal 이용하기
		
		System.out.println("------------equlas method 비교----------");
		if(str1.equals(str2)) System.out.println("same");
		else System.out.println("diff");
		
	}
	
	
}
