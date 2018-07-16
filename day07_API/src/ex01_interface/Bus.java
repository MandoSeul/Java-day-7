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
				Thread.sleep(500); // 1/1000 <==== 프로그램내에서 1초를 나타냄 즉, 500이면 0.5초동안 지연해라
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("예외");
				System.out.println(e.getMessage());
				e.printStackTrace(); // 단계적으로 예외를 찾아서 출력해주는 method
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
