
public class ReferenceLamda {
	public static void main(String[] args) {
		
		// 내가 만들어 놓은 큰수를 찾는 클래스
		int maxNum = MyMath2.max(34, 35);
		System.out.println("큰수는 : " + maxNum);
		
		// 자바에서 정의한 math 클래스
		// 밑의 두개는 같다, MyFunction의 cal을 재정의
		MyFunction m = Math :: max;
		// MyFunction m = (a, b) -> Math.max(a, b);
		System.out.println("큰수는 : " + m.cal(34, 35));
		
		MyMath3 myMath3 = Math :: max;
		System.out.println(myMath3.cal2(30, 29));
	}
}



class MyMath2{
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}

interface MyMath3{
	int cal2(int a, int b );
}