public class Hello2{
	public static void main(String[] args) {
		Apple apple= new Apple();
//		a.Say();
		
		//static을 붙히면 클래스 그대로 쓸 수 있다.
		// 
		apple.say();
		
		Hello2 h = new Hello2();
		h.hello();
		
		//가변길이 매개변수
		int sum = apple.total(1,2,3,4,5,6,7,8,9,10);
		System.out.println(sum);
		
		int sum2 = apple.total2(new int[] {1,2,3,4});
		System.out.println(sum2);
		
		//가변길이 매개변수의 실체는 배열이다.
	}
	public void hello() {
		System.out.println("I'm in a main");
	}
}
class Apple {
	//필드(속성)
	int price; // 필드
	int sum;
	int sum2;
	
	//생성자 오버로딩
	public void hello() {}
	public void hello(int x) {}
	public void hello(String s) {}
	public void hello(char c) {}
	
	
	// 가변길이 매개변수
	public int total(int ... lists) {
		for(int i : lists) {
			sum += i;
		} return sum;
	}
	public int total2(int[] values) {
		for(int i : values) {
			sum2 += i;
		} return sum2;
	}
	
	public void start() {
		say();
	}
	
	//메소드(행위)
	public void say() {
		System.out.println("apple 은 " + price + "원 입니다.");
	}
}


