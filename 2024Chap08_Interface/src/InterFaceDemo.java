
public class InterFaceDemo {

	public static void main(String[] args) {
		
		B b = new B();
		b.turnOn();
		
		IRC rc = new B();
		rc.turnOn();
		rc = new C();
		rc.turnOn();
	}
}






// 인터페이스 IRC와 추상클래스 RC는 100% 똑같다
interface IRC{
	public void turnOn();
}

abstract class RC{
	// 일반 클래스에서는 메서드의 구현을 해야된다. 구현을 하지 않을거면 추상클래스의 추상메서드로 선언해야한다.
	public abstract void turnOn();
}

interface B1{
	
}

class B implements IRC, B1{
	public void turnOn() {
		System.out.println("B 공장에서 만든 리모콘 인터페이스의 turnOn() 구현");
	}
}

class C implements IRC, B1{
	public void turnOn() {
		System.out.println("C 공장에서 만든 리모콘 인터페이스의 turnOn() 구현");
	}
}