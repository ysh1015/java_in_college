import java.io.IOException;

public class ThreadDemo {
	/*	1. Thread 클래스를 상속받아 run() 재정의
		2. Runnable 인터페이스의 run() 구현 
		3. 익명객체 생성 
		4. 람다식을 이용해서
	*/
	
	public static void main(String[] args) {
		
		// 첫번째 방법 : 상속 받아서 사용 
//		Thread th = new MyThread();
//		th.start();
		
		//두번째 방법 : 구현된 Runnable 클래스를 호출 
//		Thread th2 = new Thread(new MyRunnable());
//		th2.start();
		
		
		// 세번째 방법 : 익명 함수로 Runnable의 run 메서드 재정의
		new Thread(new Runnable() {
		    public void run() {
		        for (int i = 0; i < 5; i++) {
		            System.out.println("익명함수 구현.");
		            try {
		                Thread.sleep(500);
		            } catch (InterruptedException e) {
		                
		            }
		        }
		    }
		}).start();
		
		
		
		// 네번째 방법 : 람다식으로 구현
		// my Thread
		Thread ourThread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("람다식으로 구현. ");
				try {
					Thread.sleep(500);
				} catch(Exception e){
					
				}
			}
		});
		// 내 쓰레드의 이름 설정
		ourThread.setName("내 쓰레드");
		ourThread.start();
		try {
			ourThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ourThread.getName());
		
		
		Thread mainTH = Thread.currentThread();
		System.out.println(mainTH.getName());
		
		// main thread
//		for (int i = 0; i < 5; i++) { 
//			System.out.println("bye. ");
//			try {
//				Thread.sleep(500);
//			} catch(Exception e){
//				
//			}
//		}
		
		
		// Thread는 JVM이 관리를 하기 때문에 실행순서는 알 수가 없다.
	}
}




// ------------------------- 작업 스레드 생성과 실행 --------------------------

// 첫번째 방법 : Thread 클래스를 상속받아 run() 메서드에 할 일을 작성한다. 
//class MyThread extends Thread{
//	int n;
//	
//	public void run(){
//		while(true) {
//			System.out.println(n);
//			n++;
//			try {
//				sleep(1000);
//			} catch(Exception e){
//				
//			}
//		}
//	}
//}



// 두번째 방법 : Runnable 인터페이스의 run()을 구현
// Runnable은 함수형 인터페이스라는 것을 알 수가 있다
//class MyRunnable implements Runnable{
//	int n;
//	
//	public void run() {
//		while(true) {
//			System.out.println("안녕. ");
//			n++;
//			try {
//				Thread.sleep(2000);
//			} catch(Exception e){
//				
//			}
//		}
//	}
//}
