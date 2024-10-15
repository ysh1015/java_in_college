
public class Day_03_19and20_2024 {
	public static void main (String[] args) {
		int hour = 3, minute = 5; // 가독성이 떨어짐
		//int minute = 5;
		
		int totalMin = 60 * hour + minute;
		
		System.out.println( hour + "시간" + minute + " 분" );
		// 정수, 실수, 문자열 + "문자열" == 문자열
		//System.out.println("지금은 " + minute + "분 입니다");
		// ctrl shift L 누르면 이클립스 단축키 다 나옴
		
		System.out.println("총" + totalMin + " 분");
		
		//변수는 공간이기때문에 덮어쓰기로 됨
		
		/* 컴퓨터의 수 표현
		 * 
		 * 	1. 부호화 크기 표기법
		 * 
		 * 2. 1의 보수 표기법
		 *
		 * 3. 2의 보수 표기법
		 * 
		 * 보수가 필요한 이유 - 보수를 취해서 뺄셈을 덧셈으로 할 수 있다
		 * 지금은 cpu들이 2의 보수로 통일함
		 * */
		
		//41쪽 리터럴
		// Literal => 값 , 정수 리터럴, 소수 리터럴, 문자 리터럴, 논리 리터럴
		
		// 2진수 => 0b로 시작
		int b = 0b111;
		System.out.println(b);
		// 8진수 => 0으로 시작
		int o = 016;
		System.out.println(o);
		// 16진수 => 0x로 시작
		int x = 0xff;
		System.out.println(x);
		
		// long 예제
		// 자바에서 정수는 int형으로 자동으로 설정되는데 long으로 선언하면 강제로 형 변환돼서 넣는거임
		// 하지만 int형의 크기가 넘어가게 되면 L이나 l을 뒤에 붙혀줘야 됨
		long var1 = 10;
		long var3 = 1000000000000l;
		long var4 = 1000000000000L;
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		
		//char타입 ==> 정수형에 속함
		//문자 리터럴은 유니코드로 전환돼서 저장된다.
		
		int c1 = 'a'; // 소문자 a == 97(유니코드로 저장)
		int c2 = 'A'; // 대문자 A == 65 (유니코드로 저장)
		System.out.println(c1);
		System.out.println(c2);
		
		//16진수 => (41)16 == 16*4+1
		
		//공백은 유니코드 31을 사용해 초기화 한다
		
		// 실수 타입의 대표주자는 double, 정수 타입의 대표주자는 int
		// float 타입 리러털 뒤에는 F를 붙혀준다
		// e는 10을 뜻함. 뒤에 2는 제곱을 뜻함
		double dx = 5e-2; //0.05
		float fy = 5e2F; //500.0
		System.out.println(dx);
		System.out.println(fy);
		
		//String 문자열 => 문자들의 나열
		//이스케이프 문자(탈출 문자): 문자열 내부에 역슬래쉬(\)가 붙은 문자
		// \t => 탭, \n => 줄바꿈
		System.out.print("안녕\t");
		System.out.print("\"두리야!\"\n");
		System.out.print("너는\t바보야\n");
		
		//String str1 = """{ "두리야" }""";  -- "두리야" 출력 => 자바 13이후 버전부터 가능
		
		
		
		
		
		// 형변환(casting)  => 크게 두가지 
		//									1. 묵시적 형변환(자동 형변환) - 컴파일러가 자동적으로 해준다.
		//										-- 작은것에서 큰것으로
		//										-- 변수의 타입이 값의 타입보다 더 큰 경우(반대의 경우에는 정보의 손실)
		
		//									2. 명시적 형변환(강제 형변환) - 사용자가 직접 변환해줘야 되는 경우
		//										-- 정보의 손실을 감수하고도 강제로 형변환을 해줘야 하는 경우
		
		// byte < short char < int < long < float < double
		// float은 4바이트 double은 8바이트지만 정수형 보다 크다 왜냐하면 실수는 정수보다 크기때문
		
		//ex)
		//정수형
		byte  bt = 10;
		int value1 = b;
		System.out.println(value1);
		
		//정수형 => 실수형으로 자동 형변환
		long bigValue = 5000000L;
		float fValue = bigValue;
		System.out.println(fValue);
		
		int x2 = 'A';
		System.out.println(x2); // 알파벳의 유니코드값을 알고싶으면 찍어보자
		
		//	강제 형변환 하는 방법 - (데이터타입) => cast연산자
		System.out.println((int)'A'); // 강제형변환
		System.out.println((byte)1000000000); // 형변환은 이루어지지만 리터럴이 손실됨
		
		
	}
}
