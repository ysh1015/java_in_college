
public class ArrayDemo {

	public static void main(String[] args) {
		// 다차원 배열
		
		// 행과 열이 서로 다른것도 생성 가능
		// 3차원 배열
		int[][][] arr2 = {{{1,2,3}},{{4,5}},{{6,7,8,9,10},{11,12,13}},{{14,15}},{{16,17,18,19,20}}};
		System.out.println(arr2.length); // 행의 개수
		System.out.println(arr2[0].length); // 1행의 열의 개수
		System.out.println(arr2[1].length); // 2행의 열의 개수
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				for(int k = 0; k < arr2[i][j].length; k++) {
					System.out.print(arr2[i][j][k]+ " ");
				}
				System.out.println(" ");
			}
		}
		
		// 2차원 배열
		// 값이 정해져있지 않은 경우에는 이렇게 new 연산자로 대입을 해준다.
		int[][] arr3 = new int[3][];
		arr3[0] = new int[3];
		arr3[1] = new int[3];
		arr3[2] = new int[3];
		
		
	}
}
