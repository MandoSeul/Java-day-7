package ex01_interface;

public class Bus implements Tran {

	private double speed = 0;
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		while(speed<5){
			speed += ( accelerator * 5);
			System.out.println("Accelerating...." + speed);
			
			try {
				Thread.sleep(500); // 1/1000 <==== ���α׷������� 1�ʸ� ��Ÿ�� ��, 500�̸� 0.5�ʵ��� �����ض�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("����");
				System.out.println(e.getMessage());
				e.printStackTrace(); // �ܰ������� ���ܸ� ã�Ƽ� ������ִ� method
			}
		} // end while
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		speed = 0;
		System.out.println("stop!");
	}

}
