import java.util.Scanner;

public class Day_03_26_2024 {
	public static void main(String[] args) {
		
		// 정수 리터럴이라서 컴파일 시에 계산
		// 값이 아닐 시에는 실행할 때 계산
		// 정수 타입의 변수는 다 해당(byte, short, int, long, char)
		// int보다 작은 byte short char 이런 애들은 연산할 때 int로 자동 변환된다.
		
		//byte r = 10 + 30;
		byte x = 10;
		byte y = 30;
		//byte r2 = x + y; -- 연산식에서 변수가 사용되면 자동형변환이 이루어진다.
		// 해결방법 2가지 - r2의 자료형을 int로 바꾸던지, 강제 형변환을 해준다.(연산식은 소괄호로 묶어준다.)
		byte r2 = (byte)(x+y);
		System.out.println(r2);
		// 정수 타입의 변수가 식에 존재하면 int타입 보다 작은 byte, short타입 변수는 int로 자동으로 변환된다.
		
		double f = 1+4.;
		System.out.println(f);
		// 피연산자중 하나가 double타입이면 double 타입으로 써줘야된다.
		
		//작은 쪽은 큰 쪽을 따라가게 되어있다. 무조건!!
		
		//정수 나누기 정수는 정수, 그 외는 다 실수(double)
		//피연산자 뒤에 .을 찍어줘야 실수가 된다.
		double r = (1/2.);
		System.out.println(r);
		
		int x1 = 1, y1 =2;
		double d1 = x/y;
		System.out.println(d1);
		
		//---------------------------------------------------------------------------------------------
		
		//String 형변환 (문자열 형변환)
		
		// Byte.parseByte(str);
		// Short.Short(str);
		// Integer.parseInt(str); -- int만 Integer
		// Long.parseLong(str);
		// Float.parseFloat(str);
		// Double.parseDouble(str);
		// Boolean.parseBoolean(str);
		
		String str = "23";
		int bt = Byte.parseByte(str) + 3;
		System.out.println(bt);
		
		//기본타입을 문자열로 변경할려면
		// String.valueOf();
		String str2 = String.valueOf(bt);
		System.out.println(str2 + "입니다");
		
		//-------------------------------------------------------------------------------------------------
		// 중괄호{}로 묶으면 변수는 그 안에서만 사용가능
		
		//-------------------------------------------------------------------------------------------------
		// println() 메소드로 변수값 출력하기
		// 모니터에 값을 출력하려면 System.out.println(), System.out.print(), System.out.printf()
		System.out.printf("이름: %s", "김자바\n"); // printf는 쭉 쓰는것임
		System.out.println("이름: " + "김자바");
		
		//-------------------------------------------------------------------------------------------------
		// Scanner 타입 변수 활용하기 - 키보드로부터 입력받은 데이터를 쓴다.
		
		//Scanner 객체 import
		Scanner sc = new Scanner(System.in);
		// 입력을 받은 데이터가 변수에 저장됨
		
		System.out.println("출생년도를 입력하세요");
		int birthYear = sc.nextInt();
		sc.nextLine();
		System.out.println("당신의 출생년도는" + birthYear + "입니다");
		System.out.println(" ");
		
		System.out.println("나이를 입력하세요");
		String data = sc.nextLine();
		//입력 받은 데이터는 문자열이기 때문에 필요한 자료형으로 파싱을 해줘야한다.
		int age = Integer.parseInt(data); // 파싱할때 byte같은거 쓰지말고 int형으로 써라 그냥
		System.out.println("당신의 나이는" + age + " 입니다");
		
		
	}
}
