
public class ThreadYield {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			int cnt = 0;
			while(cnt < 2) {
				System.out.println(Thread.currentThread().getName());
				cnt++;
				// 양보를 하든 안하든 스케쥴러에 의해서 main 쓰레드가 먼저 실행되고 내 쓰레드가 나중에 실행됨
				// 스케쥴러가 알아서 처리하기 때문에 내가 yield를 한다고 해도 별 차이가 없다. 스케쥴러가 우선순위를 정해서 처리함
				Thread.yield();
			}
		};
		new Thread(r).start();
		new Thread(r).start();
		
		
		for(int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
