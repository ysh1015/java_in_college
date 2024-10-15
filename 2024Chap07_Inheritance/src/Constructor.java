
public class Constructor {

	public static void main(String[] args) {
		System.out.println("Main입니다");
		
		B b = new B();
		A a1 = new A();
		A a = new A("Hello");
		C c = new C();
		
//		a.am();
//		a.am();
//		b.bm();
		
		// 상속 받은 자식 클래스에서 부모 객체 실행
//		b.am();
		
	}
}

class A{
	// 생성자
	A(){
		System.out.println("A의 기본생성자");
	}
	A(String s){
		System.out.printf("나는 매개변수 %s을 갖는 A생성자입니다\n", s);
	}
	// 필드
	int num = 234;
	// 메서드
	public void am() {
		System.out.println("나는 A클래스입니다");
		System.out.println(num);
	}
}

class B extends A{
	B(){
		super("자식에서 던짐");
		// super()을 명시할 시에 매개변수 있는 생성자를 호출하면 기본생성자는 호출하지 않음
		System.out.println("나는 B의 생성자입니다");
	}
	int age = 23;
	public void bm() {
		System.out.println("나는 B 클래스입니다");
	}
}

class C extends B{
	C(){
		System.out.println("나는 C생성자입니다");
	}
}

class D{
	
}