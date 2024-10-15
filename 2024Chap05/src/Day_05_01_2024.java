
public class Day_05_01_2024 {
	public static void main(String[] args) {
		
		// 문자열에서 문자 추출하기 charAt() 메서드
		// charAt() 메서드는  인덱스의 문자를 리턴(0 ~ -1)
		String str = "자바 프로그래밍";
		System.out.println(str.charAt(3));
		
		// 문자열에서 문자의 개수를 얻고 싶다면 length() 메소드를 사용
		System.out.println(str.length());
		
		// 문자열에서 특정 문자열을 다른 문자열로 대체하고 싶다면 replace() 메서드를 사용
		// 기존에 있던걸 바꾸는게 아니라 새로운 객체를 만들어서 그걸 가르키는 것임
		String str2 = str.replace("자바", "Python");
		System.out.println(str);
		System.out.println(str2);
		
		// 특정 위치의 문자열을 잘라내어 가져오고 싶다면 substring() 메서드를 사용
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		// indexOf() = 특정 문자열의 위치를 찾을 때
		// 주어진 문자열이 없으면 -1을 리턴
		// 중복 문자열이 있거나 이어지는 여러개의 문자열이 있으면 맨 처음 인덱스를 리턴
		int index = ssn.indexOf("81");
		boolean isTrue = ssn.contains("4567");
		System.out.println(index);
		System.out.println(isTrue);
		
		//split() = 구분자를 사용하여 여러개의 문자열로 구성되어 있을 경우, 이를 따로 분리해서 얻는 메서드
		// comma로 구분해 놓은 것을 scv라고 한다. 
		String board = "번호,제목,내용,글쓴이";
		String[] arrBoard = board.split(",");
		for(String arrB : arrBoard) {
			System.out.print(arrB);
		}
		System.out.println();
		
		
		//------------------------------------- 배열(Array) -------------------------------------------------
		
		// 배열은 연속된 공간에 값을 나열시키고, 각 값에 인덱스를 부여해 놓은 자료구조
		// 특징 - 같은 타입의 값만 관리한다
		//        - 길이는 늘리거나 줄일 수 없다
		
		// 배열 변수 선언
		// int arr[];
		// int[] arr2; // 위에것과 동일하지만 밑에 있는 것을 선호
		// 배열 변수를 미리 선언한 후 목록을 변수에 대입 x , 왜냐하면 배열은 길이가 고정이기 때문에
		// ex) int[] score; score ={1,2,3};
		// 반드시 선언과 동시에 초기값을 주거나 길어를 먼저 주고 하나하나 대입해야한다.
		
		//변수를 먼저 선언하고 후에 대입하려면 이렇게 해야한다.
		int[] ex1;
		ex1 = new int[] {1,2,3};
		System.out.println(ex1);
		
		// 값을 출력하기 위해서는 for문을 돌릴 수 밖에 없다.
		int[] arr = {1,2,3,4,5};
		System.out.println(arr);
		
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		int[] score = {83, 90, 87};
		int sum = 0;
		for(int i = 0; i < 3; i++){
			sum += score[i];
		}
		System.out.println(sum);
		System.out.println((double)sum/3); // 평균 구할때는 double로 형변환 해준다
		
	}
}
