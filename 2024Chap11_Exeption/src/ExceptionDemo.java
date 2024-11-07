import java.io.IOException;

public class ExceptionDemo {

	// 2. throws로 떠넘기기
	public static void method() throws IOException{
		byte[] bt = {'H','A','N'};
		System.out.write(bt);
		System.out.println();
	}
	
	// os에서 main 메서드부터 찾는다
	public static void main(String[] args) {
		
		// 1. 예외 처리하기 
		try {
			method();
		} catch (IOException e) {
			System.out.println("예외 발생했어요^^");
		}
		
		int x = 1/2;
		int[] a = {1,2,3,4,5};
		try {
			System.out.println(3/x);
		} catch(ArithmeticException e){
			System.out.println("산술연산관련 예외 발생했어요^^");
		} 
	
		try {
			System.out.println(a[4]);
		} catch(Exception e) {
			System.out.println("예외발생 비상");
		} finally {
			System.out.println("나는 어떤경우라도 실행된다 (오류가 발생 안하더라도)");
		}
		
		
	}
}
