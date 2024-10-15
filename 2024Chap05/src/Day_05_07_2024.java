
public class Day_05_07_2024 {
	public static void main(String[] args) {
		
		int[] score;
		score = new int[] {30,70,80};
		
		printItem(new int[] {10,20,30});
		
		// new 연산자로 배열 생성하기
		String[]  arr = new String[3];
		arr[0] = "a";
		arr[1] = "c";
		arr[2] = "e";
		printArr(arr);
		
		
	}
	public static void printItem(int[] score) {
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum);
	}
	public static void printArr(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr[i]);
		}
		
	}
}
