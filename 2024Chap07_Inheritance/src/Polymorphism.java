
public class Polymorphism {
	// 전역 메서드로 paint라는 기능을 만듦, 매개변수로 Shape 객체를 받음
	static void paint(Shape p) {
		// Shape 형태의 draw 메서드 호출
		// 매개변수로 들어온 클래스들은 Shape 클래스를 상속 받았기 때문에 업캐스팅됨
		p.draw();
	}
	
	public static void main(String[] args) {
		// 전역 메서드인 paint 호출, 매개변수는 Line 클래스
		// Line은 Shape를 상속받은 클래스이기 때문에 paint 메서드에서 오버라이딩 됨
		paint(new Line());
		
		// 전역 메서드인 paint 호출, 매개변수는 Circle 클래스
		paint(new Circle());
	}
}

class Shape{
	public void draw() {
		System.out.println("shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Rectangle");
	}
}
