
public class AnimalRun {

	public static void main(String[] args) {
		
		// Animal animal = new Animal(); --------- 이런 식으로 직접적으로 호출이 불가능하고 자식 클래스를 이용해서 호출
		Cat cat = new Cat();
		cat.sound();
		aniSound(cat);

	}
	static void aniSound(Animal ani) {
		ani.sound();
	}

}