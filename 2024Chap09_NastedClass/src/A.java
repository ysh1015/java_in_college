
// 중첩 클래스 활용 예시

public class A {
	
	// A클래스의 생성자 생성
	A(){
		System.out.println("A 클래스 생성자 실행");
	}
	
	// A 클래스 안에 B 클래스 생성 
	static class B{
		B(){
			System.out.println("B 생성자 실행");
		}
		void m1() {
			System.out.println("B - m1 실행");
		}
		static void m2() {
			System.out.println("B - m2 실행");
		}
	}
	
	// A클래스 안에 C 클래스 생성 
	class C{
		C(){
			System.out.println("C 생성자 실행");
		}
	}
	
	public static void main(String[] args) {
		 // A클래스 안의 B클래스타입으로 b 객체 생성 
		A.B b = new A.B(); 
		b.m1();
		A.B.m2();
		
		A a = new A();
		A.C c = a.new C(); // 밑에거랑 같음 
		A.C d = new A().new C();
		
	}
}