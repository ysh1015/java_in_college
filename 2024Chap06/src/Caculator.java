
// static(정적 멤버 사용 예시)
public class Caculator {
	static String mode;
	static double pi = 3.141592;
	
	// 정적 블록 : 클래스가 실행될 때 실행. 생성자보다 먼저 실행된다.
	static {
		mode = "Eng"; //정적 블록에서 인스턴스 변수 생성 불가, 객체를 생선한 후에는 가능
		System.out.println("static block....");
	}
		
	public Caculator() {
		System.out.println("constructor...");
	}
	
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
