
public class AnonymousClass {
	public static void main(String[] args) {
		
		Tire tire = new WideTire(); // 업캐스팅
		tire.roll();
		
		// Anonymous Class of Object
		Tire anony_tire = new Tire() { // {}를 뒤에 붙혀서 익명 객체 생성 (부모 생성자를 호출)
			
			String name = "HK";
			
			@Override
			public void a() {
				System.out.println("I'm a child's a method this is overrided");
			}
			@Override
			public void roll() {
				System.out.println("스토우 타이어가 굴러갑니다");
			}
		}; 
		
		anony_tire.roll();
		anony_tire.a();
		
		Car car = new Car();
		car.run(anony_tire);
		car.run(new Tire() {
			public void run() {
				System.out.println("car anony");
			}
		});
		
	}
}
class Car{
	void run(Tire t) {
		t.roll();
	}
}

class Tire{
	public void roll() {
		System.out.println("일반 타이어가 굴러갑니다");
	}

	public void a() {
		System.out.println("I'm a parent's a method");
	}
}

class WideTire extends Tire{
	@Override
	public void roll() {
		System.out.println("광폭 타이어가 굴러갑니다");
	}
}












/**
 * 자바에서 **익명 객체(Anonymous Object)**란, 이름이 없는 클래스의 인스턴스를 말합니다. 
 * 보통 **익명 클래스(Anonymous Class)**와 함께 사용됩니다. 익명 클래스는 클래스 선언과 객체 생성을 동시에 하는 방식으로, 특정한 일회성의 작업을 수행할 때 유용합니다. 
 * 익명 클래스는 구현하려는 인터페이스나 상속하려는 클래스를 기반으로 즉석에서 정의되며, 이를 통해 객체를 생성합니다.

익명 객체의 주요 특징:

	1.	클래스 이름이 없음: 익명 클래스는 이름이 없는 클래스이므로, 한 번만 정의되고 그 자리에서 바로 객체가 생성됩니다.
	2.	간단한 사용: 주로 이벤트 리스너, 콜백 함수 등 일시적인 작업을 처리할 때 사용합니다.
	3.	내부 클래스: 익명 클래스는 내부적으로 클래스를 선언하고, 바로 객체를 생성하므로 외부에서 해당 클래스를 재사용할 수 없습니다.
	4.	상속 또는 인터페이스 구현: 익명 클래스는 반드시 기존의 클래스나 인터페이스를 상속하거나 구현해야 합니다.

예시
interface Animal {
    void sound();
}

public class Main {
    public static void main(String[] args) {
        // 익명 클래스 사용하여 Animal 인터페이스 구현
        Animal dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("Bark");
            }
        };
        dog.sound();  // 출력: Bark
    }
}

위 코드에서 Animal 인터페이스를 구현한 익명 객체가 생성되었습니다. 
dog이라는 객체는 이름 없는 클래스로 생성된 인스턴스입니다. 
이 클래스는 sound() 메서드를 구현하며, 그 자리에서 객체를 생성하고 사용합니다.

익명 객체는 자주 사용되지 않는 클래스를 빠르게 생성하고 사용할 수 있는 편리한 방법을 제공합니다.
 하지만 코드가 복잡해지면 가독성이 떨어질 수 있으므로 신중하게 사용하는 것이 좋습니다.
 * 
 * /
 */