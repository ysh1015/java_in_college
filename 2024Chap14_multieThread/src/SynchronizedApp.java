
public class SynchronizedApp {
	public static void main(String[] args) {
		SharePrinter sp = new SharePrinter();
		Thread th1 = new PrintThread(sp, 5);
		Thread th2 = new PrintThread(sp, 100);
		th1.start();
		th2.start();
	}
}



// 공유 객체
class  SharePrinter{
	// 공유객체에 synchronized 키워드를 붙여서 하나씩 실행되도록 동기화 시킨다
	synchronized void printer(int n) {
		for(int i =1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch(Exception e) {
				
			}
		}
		
	}
}

// 내 쓰레드 정의
class PrintThread extends Thread{
	SharePrinter p;
	int n;
	
	PrintThread(SharePrinter p, int n){
		this.p = p;
		this.n = n;
	}
	public void run(){
		p.printer(n);
	}
}