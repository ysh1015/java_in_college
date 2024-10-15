import java.util.Scanner;

public class Day_04_17_2024 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//-------------------------------------do while문-----------------------------------------------------
//		String inString;
//		System.out.println("아무거나 입력하세요");
//		System.out.println("종료 시 q를 입력하세요");
//		do {
//			System.out.print(">>");
//			inString = in.nextLine();
//			System.out.println(inString);
//		}while(!inString.equals("q")); {
//			System.out.println("프로그램 종료");
//		}
		
		//------------------------------------- break문 ------------------------------------------------------
		// 반복문과 스위치문에서 사용
		
//		while(true) {
//			int num1 = (int)(Math.random()*6)+1;
//			System.out.println("반복문 실행");
//			if(num1 == 6) {
//				break;
//			}
//		}
//		System.out.println("반복문 탈출");
		
		
		// 중첩 for문일때 break문을 쓰면 해당 for문을 빠져나가 바깥쪽 포문을 돈다
		// for문 앞에 Outter를 쓰면 안쪽 for문에서 break를 만나더라도 바깥쪽까지 빠져나간다
//		Outter:for(char upper = 'A'; upper <= 'D'; upper++) {
//			for(char lower = 'a'; lower <= 'z'; lower++) {
//				System.out.println(upper +"-"+ lower);
//				if(lower == 'g') {
//					break Outter;
//				}
//			}
//		}
		
		//--------------------------------------countinue 문---------------------------------------------------
		// 반복문 안에서만 사용가능
		// for문의 증감식, while문의 조건식으로 이동하여 반복문 계속 실행
		
		// 짝수만 찍기
//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 != 0) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
		
		for(int i = 3 * 2; i <= 30; i+=3) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		int num2 = 4;
		while(num2 <= 30) {
			System.out.print(num2 + " ");
			num2 += 4;
		}
		
		
		
		
	}
}
