
public class AirPlaneStudy {
	public static void main(String[] args) {
		SuperAirPlane sa = new SuperAirPlane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperAirPlane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperAirPlane.NORMAL;
		sa.fly();
		sa.land();
	}
}

class AirplaneMode{
	protected void fly() {
		System.out.println("일반비행 모드");
	}
	public void land() {
		System.out.println("착륙합니다");
	}
	public void takeOff() {
		System.out.println("이륙합니다");
	}

}

class SuperAirPlane extends AirplaneMode{
	// 상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	// 상태 필드 선언
	public int flyMode = NORMAL;
	
	//메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		}else if(flyMode == NORMAL){
			// Airplane 객체의 fly() 메서드 호출
			super.fly();
		}

	}
}
