
public class MarkerExample {

	public static void main(String[] args) {
//		String msg = "안녕하세요";
//		Marker m = new Marker(); // Marker 클래스로 만들어진 m이라는 객체 
//		//m.writeOnboard(msg);
		
		// 기본 생성자
		// - 모든 클래스는 생성자가 존재하며, 하나 이상을 가질 수 있다. 클래스에 생성자 선언이 없으면 컴파일러가 만든다.
		// - 생성자가 없을 때 컴파일러가 만들어주는 것을 기본 생성자라고 한다.
		
		Marker marker = new Marker("검정색", 100);
		marker.writeOnboard("자바는 객체지향 언어이다.");
		marker.whatColor();
		marker.writeOnboard("자바는 자바다");
		marker.howMucyInk();
		System.out.println(marker.whatColor() + " " + marker.howMucyInk());
		
		Marker myMarker = new Marker("빨강색");
		myMarker.writeOnboard("C는 절차지향 언어이다.");
		myMarker.whatColor();
		myMarker.writeOnboard("C is C");
		myMarker.howMucyInk();
		System.out.println(myMarker.whatColor() + " " + myMarker.howMucyInk());
	}
}
class Marker{
	// 상태는 변수로 표현(필드)
	// 속성 즉 상태는 자기 자신에 의해서 변화가 일어난다.(수동적이 아니라 능동적으로)
	// private을 써줘서 외부에서 못쓰게 한다.
	private int ink; // 속성(=필드)
	private String color;
	
	// 생성자
	public Marker() {}
	public Marker(String color) {
		// 생성자 안에서 다른 생성자를 사용하고 싶을 때 
		this(color, 100);
	}
	public Marker(String color, int ink) {
		// 객체 지향에서 this는 자기 자신
		this.color = color;
		this.ink = ink;
	}
	
	// 기능은 method로 표현
	public void writeOnboard(String s) { // 행위(=메소드)
		System.out.println(s);
		ink -= 1;
	}
	public int howMucyInk() {
		System.out.println("남아있는 잉크양 = " + ink);
		return ink;
	}
	public String whatColor() {
		System.out.println("마커 색상은 " + color);
		return color;
	}
}

