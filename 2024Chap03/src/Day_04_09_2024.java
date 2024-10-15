
public class Day_04_09_2024 {

	public static void main(String[] args) {
		// ================================== switch문 ==============================================
		// switch문
		// switch문의 괄호에는 정수타입(byte, char, short, int, long)과 문자열 타임(String)만 사용 가능
		// break가 없으면 밑으로 쭉 실행이 된다.
		// case뒤에믄 하나의 값만 올 수 있다.
		
//		int dice = (int) (Math.random()*6) +1;
//		
//		switch(dice) {
//			case 1:
//				System.out.println("1번이 나왔습니다.");
//				break;
//			case 2:
//				System.out.println("2번이 나왔습니다.");
//				break;
//			case 3:
//				System.out.println("3번이 나왔습니다.");
//				break;
//			case 4:
//				System.out.println("4번이 나왔습니다.");
//				break;
//			case 5:
//				System.out.println("5번이 나왔습니다.");
//				break;
//			default:
//				System.out.println("6번이 나왔습니다.");
//		}

//		char grade = 'B';
//		switch(grade) {
//			case 'A':
//			case 'a':
//				System.out.println("우수회원.");
//				break;
//			case 'B': case 'b':
//				System.out.println("일반회원");
//				break;
//			default:
//				System.out.println("손님입니다.");
//		}
		
//		int score = (int)(Math.random()*99) + 1;
//		
//		switch(score / 10) {
//			case 9:
//				System.out.println("90점대");
//				break;
//			case 8:
//				System.out.println("80점대");
//				break;
//			case 7:
//				System.out.println("70점대");
//				break;
//			case 6:
//				System.out.println("60점대");
//				break;
//			case 5:
//				System.out.println("50점대");
//				break;
//			case 4:
//				System.out.println("40점대");
//				break;
//			case 3:
//				System.out.println("30점대");
//				break;
//			case 2:
//				System.out.println("20점대");
//				break;
//			default:
//				System.out.println("나락");
//		}
		
		
		//===================================== 반복문 =================================================
		
		// 반복문은 조건이 참일 때만 실행한다.
		// 초기식에는 부동소수점 쓰지 말자.(오차가 아주 큼)
		
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j <  i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//for문(1부터 10까지 짝수만 더하기)
		int sum = 0;
		for(int i = 0; i <= 10; i+=2) {
			sum += i;
		}
		//for문(10부터 1까지 홀수만 더하기)
		System.out.println(sum);
		for(int i = 10; i <= 0; i-=2) {
			sum += i;
		}
		System.out.println(sum);
		
		// whiile문(1부터 10까지 더하기)
		int sum2 = 0;
		int k= 0;
		while(k <= 10) {
			sum2 += k;
			k++;
		}
		System.out.println(sum2);
		
		// 구구단 3단 출력
		for(int i = 1; i <= 9; i++) {
			int value = 3 * i;
			System.out.println(3 + "*" + i + "=" + value);
		}
		
		// 최대 공약수 구하기
		int a = 12;
		int b = 24;
		int gcd = 0;
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println("a와 b의 최대 공약수 = " + gcd);

	}
}
