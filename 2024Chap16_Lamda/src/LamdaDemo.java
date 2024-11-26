interface MyFunction{
	int cal(int a, int b);
}

interface MyPrint{
	void print();
}

public class LamdaDemo {

	public static void main(String[] args) {

		Runnable r = ( )-> System.out.println("람다식");
		r.run();
		
		
		// 익명 객체 생성
		MyFunction myFuncMul = new MyFunction() {
			public int cal(int a, int b) {
				return a * b;
			}
		};
		
		System.out.println(myFuncMul.cal(5, 4));
		
		// 람다식으로 익명객체 생성
		MyFunction myFuncAdd = (a , b) -> a + b; // 함수형 인터페이스의 cal 객체를 구현
		System.out.println(myFuncAdd.cal(5, 4));
		
		Calculator(20, 5, (a , b) -> a / b); // 나눗셈
		Calculator(335, 330, (a,b) -> Math.max(a, b)); // 큰 수 찾기
		
		MyPrint mp = () -> System.out.println("난 매개변수 없는 람다식!");
		mp.print();
		
	}
	
	// 행위를 파라미터화 시킴
	static void Calculator(int a, int b, MyFunction f) {
		System.out.println(f.cal(a, b));
	}
	
	
}









interface IXXX{ // 추상메서드가 하나가 존재하는 함수형 인터페이스
	void run();
	public default void sum() {
		
	}
	
	static void print() {
		
	}
}
