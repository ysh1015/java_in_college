
public class BoxingUnboxing {

	public static void main(String[] args) {
		
		// Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue()); // intValue() 메서드는 Integer 객체 내부의 int 값을 리턴
		
		// Unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		// 연산 시 unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
	}
}
