// static(정적 멤버 사용 예시)
public class CaculatorRun {
	int year; // static 안 쓰려면 객체 생성하고
	
	public static void main(String[] args) {
		CaculatorRun c1 = new CaculatorRun(); // static은 static끼리 놀고 아니면 객체를 생성해서 가져다 써야된다.
		c1.year = 2024;
		System.out.println(c1.year);
		
		double result1 = 10 * 10 * Caculator.pi;
		int result2 = Caculator.plus(10, 5);
		int result3 = Caculator.minus(10, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
}
