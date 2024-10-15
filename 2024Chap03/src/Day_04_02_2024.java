
public class Day_04_02_2024 {
	public static void main(String[] args) {
		int charCode = 'A'; // 정수 65
		// 대문자는 65 ~ 90 (A~Z)
		// 소문자는 97 ~ 122 (a~z)
		System.out.println(charCode);
		
		if(65 <= charCode && charCode <= 90) {
			System.out.println((char)charCode + "는 대문자" );
		}
		
		// ================================== 비트 연산자 ==============================================
		int x = 7, y = 5;
		System.out.println(x&y); // 5출력 - And(논리곱)
		System.out.println(x|y); // 7출력 - Or(논리합)
		System.out.println(x^y); // 2출력 - XOR(베타적 논리합)
		System.out.println(~3); // -1출력 - NOT(논리 부정)
		System.out.println(~45 + 46);
		
		// ================================== 비트 이동 연산자 ===========================================
		//  2 * 8 == 8 << 1       = 16
		// 8 / 2 == 8 >> 1        = 4
		
		// ================================== 대입 연산자 ================================================
		int z = 4, h = 6;
		//x = x + 6;
		z += 6;
		//z -= 6;
		//z *= 6;
		//z /= 6;
		//z %= 6;
		System.out.println(z);
		System.out.println(6 * 16); // 6 >> 4랑 같음
		
		// =================================== 삼항 연산자 ==========================================
		int max = z > h? z: h;
		System.out.println(max);
		
		int score = 81;
		char grade = score > 90? 'A': score > 80? 'B': 'C'; // 조건식 ? True : false
		System.out.println(grade );
		// 밑에 코드가 더 가독성이 좋다.
		/* char grade;
			if (score > 90) {
			    grade = 'A';
			} else if (score > 80) {
			    grade = 'B';
			} else {
			    grade = 'C';
			}
		 * */
	}
}
