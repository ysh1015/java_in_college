
public class Day_04_30_2024 {
	public static void main(String[] args) {
		
		//------------------------------------- 참조 타입 -----------------------------------------------------
		// address랑 reference랑 비슷
		
		// 참조값(reference value) : 주소값
		// 정수, 실수 , 논리형이 아니면 싹 다 참조형
		
		// 변수는 값을 저장할 목적으로 사용한다.
		// 변수가 뭐냐에 따라서 데이터값이 들어갈지 주소값이 들어갈지 정해진다.
		
		// 진짜 객체는 heap영역에 저장되고 변수는 stack영역에 저장된다.
		// str1은 참조형 변수
		
		String str1 = "Java..."; 
		String str3 = "Java...";
		// 이런식으로 변수만 다르게 쓰면 자바에서는 메모리 값을 아끼기 위해 같은 주소값을 참조한다. 
		String str2 = new String("Java..."); 
		// new를 사용하면 값이 다르는 같든 다른 곳에 저장해서 같은 주소값을 참조하지 않는다.
		
		//그렇기 때문에 데이터값이 같은지를 비교하려면 equals함수를 써준다.
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		
	}
}
