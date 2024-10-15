
public class CarRun {

	public static void main(String[] args) {
		// m.ink = 50; // 정보은닉으로 접근 불가
		// m.howMucyInk();
		
		Car car1 = new Car(); // car는 객체변수(참조변수)
		car1.run();
		//car1.year = 2024; // private로 접근 제한자를 쓰면 변경 불가
		
		Car car2 = new Car(); 
		car2.run();
		car2.whatColor();
		car2.changeColor("black");
		car2.whatColor();
		//new 연산자는 객체를 생성한 후 연이어 생성자를 호출해서 객체를 초기화하는 역할을 한다.
		
		car2.changeColor("red");
		car2.whatColor();
		System.out.println(car2.getYear());
		car2.setYear(2025);
		System.out.println(car2.getYear());

	}
}
