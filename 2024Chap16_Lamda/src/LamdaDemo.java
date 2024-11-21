
public class LamdaDemo {

	public static void main(String[] args) {

		Runnable r = ( )-> System.out.println("람다식");
		r.run();
		
		System.out.println(f(2, 3));
		
//		age -> System.out.println("나이는 " + age);
//		(x, y) -> System.out.println(x + y);
	}
	
	// f(x,y) = x + y 를 자바식으로 표현
	static int f(int x, int y) {
		return x + y;
	}
	
	static void ageFun(int age) {
		System.out.println("나이는 " + age);
	}
	
}


interface IXXX{ // 추상메서드가 하나가 존재하는 함수형 인터페이스
	void run();
	public default void sum() {
		
	}
	
	static void print() {
		
	}
}
