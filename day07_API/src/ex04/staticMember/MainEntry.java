package ex04.staticMember;

class Atm{
	int count; //instance member // class 변수는 초기화 안해도 0
	static int total; // static member
	
	public Atm(int account){
		// constructor method
		count +=account; // count = count+account;
		total += account;// total = total + account;
	} 
	public static void view(){ // static method에서는 instace member 변수는 사용할 수 없음
		
		total +=100;
		//count += 100; // count가 instance 변수 인데 static에 이용하여서 오류
		//객체 생성이 되어야만 이용할 수 있음.
	}
	public void show(int count, int total){
		this.total = total;
		this.count = count;
	}
	public void display(){
		count = count + 200;
		total += 200; // instance method에서는 둘다 사용가능
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm atm = new Atm(1000);
		atm.display(); // count = 1000, total = 1000;
		System.out.println("-----------구별------------");
		Atm atm2 = new Atm(1000);
		atm2.display(); // count = 1000, total = 2000;
		System.out.println("-----------구별------------");
		Atm atm3 = new Atm(1000);
		atm3.display(); // count = 1000, total = 3000;
		
	}
}
// heap 해제는 gc가 알아서 해줌 ( c와 다른점 )
// 강제로 하고싶으면 finalize로 함

