package ex04.staticMember;

class Atm{
	int count; //instance member // class ������ �ʱ�ȭ ���ص� 0
	static int total; // static member
	
	public Atm(int account){
		// constructor method
		count +=account; // count = count+account;
		total += account;// total = total + account;
	} 
	public static void view(){ // static method������ instace member ������ ����� �� ����
		
		total +=100;
		//count += 100; // count�� instance ���� �ε� static�� �̿��Ͽ��� ����
		//��ü ������ �Ǿ�߸� �̿��� �� ����.
	}
	public void show(int count, int total){
		this.total = total;
		this.count = count;
	}
	public void display(){
		count = count + 200;
		total += 200; // instance method������ �Ѵ� ��밡��
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm atm = new Atm(1000);
		atm.display(); // count = 1000, total = 1000;
		System.out.println("-----------����------------");
		Atm atm2 = new Atm(1000);
		atm2.display(); // count = 1000, total = 2000;
		System.out.println("-----------����------------");
		Atm atm3 = new Atm(1000);
		atm3.display(); // count = 1000, total = 3000;
		
	}
}
// heap ������ gc�� �˾Ƽ� ���� ( c�� �ٸ��� )
// ������ �ϰ������ finalize�� ��

