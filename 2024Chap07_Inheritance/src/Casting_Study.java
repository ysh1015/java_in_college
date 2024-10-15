
public class Casting_Study {
	public static void main(String[] args) {
		
//		Ex1 ex1 = new Ex1(); // new 부분은 컴파일시에 신경 안쓴다.
//		Ex2 ex2 = new Ex2(); 
//		
//		// 선언형과 실체형이 동일하기 때문에 아무런 문제가 없다
//		ex2.method(); 
//		ex2.a();
//		ex1.a();
		
		Ex1 ex3 = new Ex2(); // 컴파일시에는 Ex1을 확인
		// ex3.a(); // 호출 시에는 Ex2(자식)을 확인
		
		// 업캐스팅했을 때는 부모의 클래스의 필드와 메서드만 접근 가능
		ex3.name = "대한항공";
		// ex3.department = "아시아나"; -----오류
		
		// **하지만 오버라이딩된 메서드가 있다면 업캐스팅이 되었어도 부모 메서드 대신 오버라이딩된 메서드가 호출된다.**
		// 자신의 것을 호출하지만 오버라이딩된 메서드가 있다면 그것을 따라가서 오버라이딩된 메서드를 실행한다;
		// 이런 현상을 동적 바인딩이라고 한다. (Dynamic Binding) == 다형성이라고도 한다(Polymorpism)
		ex3.a();
		
	}
}

class Ex1{
	String name;
	
	public void a() {
		System.out.println("Ex1 클래스의 a메서드 입니다.");
	}
}

class Ex2 extends Ex1{
	String department;
	
	public void a() {
		System.out.println("Ex2 클래스의 a메서드 입니다.");
	}
	public void method() {
		System.out.println("Ex2의 클래스의 method 메서드입니다");
	}
}
