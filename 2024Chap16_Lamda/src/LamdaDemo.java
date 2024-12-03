// 인터페이스 안에 하나의 추상메서드만 있는것 -> 함수형 인터페이스
interface MyFunction{
	int cal(int a, int b);
}

interface MyPrint{
	void print();
}

// 기능을 구현해 놓은 클래스
class MyMath{
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public static int sum(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
}



public class LamdaDemo {

	public static void main(String[] args) {

		Runnable r = ( )-> System.out.println("람다식");
		r.run();
		
		
		// 익명 객체 생성, MyFunction의 cal을 재정의
		MyFunction myFuncMul = new MyFunction() {
			public int cal(int a, int b) {
				return a * b;
			}
		};
		
		System.out.println(myFuncMul.cal(5, 4));
		
		// 람다식으로 익명객체 생성, MyFunction의 cal을 재정
		MyFunction myFuncAdd = (a , b) -> a + b; // 함수형 인터페이스의 cal 객체를 구현
		System.out.println(myFuncAdd.cal(5, 4));
		
		Calculator(20, 5, (a , b) -> a / b); // 나눗셈
		Calculator(335, 330, (a,b) -> Math.max(a, b)); // 큰 수 찾기

		
		// 밑에 둘이 같음, MyFunction의 cal을 재정의
		MyFunction m = Math::max;
		// MyFunction m = (a,b) -> Math.max(a, b));
		System.out.println("큰 수 출력 : " + m.cal(45, 78));
		
		MyFunction sum = MyMath :: sum;
		System.out.println("합 출력 : " + sum.cal(1, 10));
		
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
