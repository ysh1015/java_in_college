import java.util.Arrays;

public class Day_05_08_2024 {
	public static void main(String[] args) {
//		// 2차원 배열 예시
//		// 각 차원의 크기 정의
//        int[] sizes = {3, 4}; // 3행 4열
//
//        // 2차원 배열 생성
//        int[][] twoDArray = new int[sizes[0]][sizes[1]];
//
//        // 값을 할당
//        for (int i = 0; i < twoDArray.length; i++) {
//            for (int j = 0; j < twoDArray[i].length; j++) {
//                twoDArray[i][j] = i + j;
//            }
//        }
//
//        // 값 출력
//        for (int i = 0; i < twoDArray.length; i++) {
//            for (int j = 0; j < twoDArray[i].length; j++) {
//                System.out.print(twoDArray[i][j] + " ");
//            }
//            System.out.println();
//        }
        
        
        
        // 참조타입(클래스, 인터페이스) 배열은 각 항목에 객체의 번지를 저장
        String[] strArr = {"Java", "C++", "C#"};
        System.out.println(strArr[2]);
        
        // 주소값을 비교하기 때문에 문자열 비교할 때는 equals함수로 비교한다.
        String[] strArr2 = new String[3];
        strArr2[0] = "Java";
        strArr2[1] = "Java";
        strArr2[2] = new String("Java");
        System.out.println(strArr2[0]==strArr[1]); // false
        System.out.println(strArr2[0]==strArr[2]); // false
        System.out.println(strArr2[0].equals(strArr2[2])); //true
        
        for(String c:strArr) {
        	System.out.println(c);
        }
        
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // for문으로 배열 돌리기
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        // foreach문으로 배열 돌리기
        for(int i : arr) {
        	System.out.print(i + " ");
        }
        System.out.println(" ");
        // 배열처럼 보여준다.
        System.out.println(Arrays.toString(arr));
        
        
        // ----------------------------------- 배열 복사 -------------------------------------------
        // 배열은 한번 생성하면 길이 변경 x
        // 더 많은 저장 공간이 필요하면 더 큰 길이의 배열을 새로 만들고 이전 배열로부터 항목들을 복사해야 한다.
        
        //----------------------------------- 열거 타입 ----------------------------------------------------
        // 요일, 계절 같이 한정된 값을 갖는 타입을 열거 타입(enumeration type)이라고 한다.
	}
}
