import java.io.IOException;

public class ThreadDemo {
	public static void main(String[] args) {
		
		// 첫번째 방법 ( 상속 받아서 사용 ) 
		//Thread th = new MyThread();
		//th.start();
		
		//두번째 방법 ( 구현된 Runnable 클래스를 호출 )
		Thread th2 = new Thread(new MyRunnable());
		th2.start();
	}
}




// ------------------------- 작업 스레드 생성과 실행 --------------------------

// 첫번째 방법 : Thread 클래스를 상속받아 run() 메서드에 할 일을 작성한다. 
class MyThread extends Thread{
	int n;
	
	public void run(){
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			} catch(Exception e){
				
			}
		}
	}
}



// 두번째 방법 : Runnable 인터페이스의 run()을 구현
class MyRunnable implements Runnable{
	int n;
	
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(2000);
			} catch(Exception e){
				
			}
		}
	}
}
