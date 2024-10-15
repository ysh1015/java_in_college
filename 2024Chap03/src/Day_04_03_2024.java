
public class Day_04_03_2024 {
	public static void main(String[] args) {
		/*	프로그램 문법
		 * 	1. 순차문 => ((선언문 - int y = 4);, (배정문 - x = 47;))
		 * 	2. 제어문 => (조건문 - if)
		 * 	3. 반복문(loop) => (for, while, do-while, for each)
		 * 	4. 분기문 => (break, continue)
		 * 
		 * */
		
		/*	제어문 == 코드 실행 흐름을 제어
		 * 
		 * 	if(조건식){
		 * 	
		 * 	}
		 * 
		 * 조건식(conditional expression)에는 true or false값을 산출하는 식을 넣어야 함
		 *	산술식은 들어갈 수 없음
		 * */
		
		int charCode = 'A';
		if(!(65 <= charCode && charCode <= 90)) {
			System.out.println("조건식은 참 입니다" + " " + (int)charCode);
		} else {
			System.out.println("조건식은 거짓입니다");
		}
		
		
		
		
		int score = 95;
		if(score >= 90) {
			System.out.println("90보다 크다.");
			System.out.println("A등급");
		} else if(score >= 80) {
			System.out.println("80보다 크다.");
			System.out.println("B등급");
		} else if(score >= 70) {
			System.out.println("C등급");
		} else {
			System.out.println("D등급 이하");
		}
		
		// Math.random() => 0.0 <= ~ < 1.0 사이의 double타입 난수를 리턴한다.
		// int로 형 변환을 해주고 +1을 해줘야한다.
		// 왜냐하면 0.0에 아무리 곱해봐야 0이기 때문
		
		// 1부터 6사이의 정수값을 임의로 산출해준다.(주사위)
		int dice = (int) (Math.random() *6) + 1;
		System.out.println(dice);
		
	}
}
