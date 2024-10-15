
class Car {
	//필드(속성)는 초기화를 안하고 선언만 해도 자동으로 0으로 초기화 된다.
	private String color;
	private int year = 2024;
	int price;
	
	// void를 붙히면 생성자로 인식을 안 하고 메서드로 인식한다.
	public Car() {
		System.out.println("자동차 객체가 생성됩니다...");
		color = "white";
	}
	public void run() { // 외부에서 접근 가능하게 하도록 위해서 public을 붙혀준다
		System.out.println("car is run.....");
	}
	// 이런 메소드를 setter라고 부른다.
	public void changeColor(String s) {
		color = s;
	}
	// 이런 메소드를 getter라고 부른다.
	public void whatColor() {
		System.out.println("내 차 색상은 " + color);
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
