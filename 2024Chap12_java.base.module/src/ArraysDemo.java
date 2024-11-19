import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {

		Integer[] arr = {1,2,3,4,5,100};
		List<Integer> list =  Arrays.asList(arr); // 배열을 리스트로 바꿔주는 메서드
		System.out.println(list);
		
		String[] str = {"Kim", "Lee", "Choi", "Park"};
		List<String> strList = Arrays.asList(str);
		System.out.println(strList);
		
		// 배열 복사 - static T[] copyOf()
		String [] cpArr = Arrays.copyOf(str, 7);
		System.out.println(Arrays.toString(cpArr));
		
		// 배열 복사 - Arrays.copyOfRange(복사하고자 하는 배열, from, to);
		String[] cpArr2 = Arrays.copyOfRange(str, 0, str.length);
		System.out.println(Arrays.toString(cpArr2));
		
		// ArrayList 요소 추가 
		ArrayList<String> listStr = new ArrayList();
		listStr.add("Faker");
		listStr.add("Gumaysi");
		listStr.add("Oner");
		listStr.add("Zeus");
		listStr.add("Keria");
		System.out.println("T1 : " + listStr);
		
		int [] numArr = {34, 12, 78, 30, 27, 89, 45};
		int [] numArr2 = {34, 12, 78, 30, 27, 89, 44};
		int [][] numArr3 = {{1,2,3},{4,5}};
		int [][] numArr4 = {{1,2,3},{4,5}};
		System.out.println("정렬 전 : " + Arrays.toString(numArr)); // toString을 쓰면 반복문 돌릴 필요 없이 리스트 형식으로 출력
		Arrays.sort(numArr); // 정렬하는 메서드
		System.out.println("정렬 후 : " + Arrays.toString(numArr));
		System.out.println(Arrays.equals(numArr, numArr2)); // Arrays.equals() 함수는 내용적으로 똑같은지 비교하는 것
		System.out.println(Arrays.deepEquals(numArr3, numArr4)); // 2차원 배열 이상일때는 deepEquals로 비교해야함
		System.out.println(Arrays.deepToString(numArr3)); // 2차원 배열 이상일때는 deepToString으로 써야함
		
		// binary search : 정렬을 한 후에 위치를 찾아줌, -가 나오면 못찾았다는 뜻
		System.out.println("8 is at : " + Arrays.binarySearch(numArr, 45));
		
		// fill - 대용량을 어떤값으로 초기화 시킬때 사용
		boolean[] prime = new boolean[15]; // 초기값을 안주면 false로 세팅된다. int형식이면 0으로 세팅
		Arrays.fill(prime, false); // fill 기능이 없다면 for문 돌려야됨, int형식일 때 특정한 값으로 세팅하고 싶을 때 사용하면 좋다
		System.out.println(Arrays.toString(prime));
		
		for(int i = 0; i < prime.length; i++) {
			prime[i] = true;
			System.out.print(prime[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		// lamda 식
		int[] odd = new int[10];
		Arrays.setAll(odd, x -> x*2 + 1); // 집합의 조건제시법과 비슷함, in python: odd = [x for x in range(20)]
		System.out.println(Arrays.toString(odd));
		
		
		
		
	}
}
