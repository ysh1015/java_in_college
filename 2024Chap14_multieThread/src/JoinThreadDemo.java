class SumThread extends Thread{
	int total; 
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 1; i <= 100; i++) {
			total += i;
		}
	}
}

public class JoinThreadDemo {
	public static void main(String[] args) throws Exception { // 내가 처리 안하고 나를 호출한 메서드한테 throws 해줌
		SumThread sumTh = new SumThread();
		sumTh.start();
		// *******main 쓰레드가 먼저 실행되기 때문에 join을 써서 내가 만든 쓰레드가 먼저 실행되도록 기다려줘야 한다.*******
		sumTh.join();
		System.out.println(Thread.currentThread().getName());
		System.out.println("합은 : " + sumTh.total);
	}
}


// main 쓰레드가 먼저 실행되고 그 다음 쓰레드 실행
