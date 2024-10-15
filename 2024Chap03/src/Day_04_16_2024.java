import java.util.Scanner;
public class Day_04_16_2024 {
	public static void main(String[] args) {
		
		// while문으로 10부터 1까지 내려오면서 더하기 
		int sum = 0;
		int k = 5;
		while(k >= 1) {
			sum += k;
			k--;
		}
		System.out.println(sum);
	
// -------------------------------------------최대공약수 구하기-----------------------------------------------
		Scanner in = new Scanner(System.in);
//		
//		// a가 b와 같거나 커야한다.
//		int a = in.nextInt();
//		int b = in.nextInt();
//		
//		if(b > a) {
//			int tmp = a;
//			a = b;
//			b = tmp;
//		}
		
		// 일반적인 방법
//		int gcd = 0;
//		
//		for(int i = 1; i <= b; i++) {
//			if(a %  i== 0 && b % i == 0)
//				gcd = i;
//		}
//		System.out.println(gcd);
		
		// 유클리드 호제법
//		while(b != 0) { // b == 0이면 반복문 종료
//			int tmp = a % b;
//			a = b;
//			b = tmp;
//		}
//		System.out.println(a);
		
		//컴퓨터 공학에서 * : 아무거나, 모두(wild card)

		/*	유클리드 호제법
		 * 	GCD(a,b) = GCD(b,r)                 // r = a % b
		 * GCD(12,6) = GCD(6, 12%6)
		 * 
		 * */
		
//--------------------------------------------소수 판별 하기-------------------------------------------------
		/*
		 * 소수 : 1과 자기 자신 외에는 나누어지지 않는 수
		 	단 1은 소수가 아니다 
		 */
		
		// num1이 소수인지 판별하기
//		boolean prime = true;
//		int num1 = in.nextInt();
//		
//		for(int i = 2; i < num1; i++ ) {
//			if(num1 % i == 0) {
//				prime = false;
//				break;
//			}
//		}
//		if(prime) {
//			System.out.println(num1 + " is a prime number");
//		} else {
//			System.out.println(num1 + " is not a prime number");
//		}
		
//-----------------------------------------------------------------------------------------------------------------
		
		
		while(true) {
			
			System.out.println("1 또는 2를 입력, 종료를 원하면 3입력");
			//한번 돌아갈때마다 입력을 기다린다
			int num2 = in.nextInt();
			
			if(num2 == 1) {
				System.out.println("속도 증가");
			} else if(num2 == 2) {
				System.out.println("속도 감소");
			}
			if(num2 == 3) {
				System.out.println("반복 탈출...");
				break;
			}
		}
		 
	}
}
