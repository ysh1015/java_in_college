
public class Overriding {
	public static void main(String[] args) {
		A1 b = new C1();
		b.am();
		
	}
}

class A1{
	public A1(){
		System.out.println("hi");
	}
	public A1(int i) {
		System.out.println(i);
	}
	// 필드
	int num = 234;
	// 메서드
	protected void am() {
		System.out.println("나는 A클래스입니다");
	}
}

class B1 extends A1{
	int age = 23;
	
	public B1() {
		
	}
	public B1(int i) {
		super(i);
	}
	@Override
	public void am() {
		System.out.println("나는 A클래스의 am을 오버라이딩한 객체입니다");
	}
	public void am(String s) {
		System.out.println(s);
	}
	void bm1() {
		System.out.println("나는 bm1객체입니다 ");
	}
}

class C1 extends B1{
	public void am() {
		super.am();
		super.am("B1의 am을 오버라이딩 했음");
	}
}


