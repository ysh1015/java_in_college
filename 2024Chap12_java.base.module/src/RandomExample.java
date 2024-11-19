import java.util.*;

public class RandomExample {

	public static void main(String[] args) {

		// seed 값이 동일하면 계속 똑같은 숫자만 나온다.
		Random rnd = new Random();
		
		System.out.println("복권번호");
		for(int i = 1; i <= 6; i++) {
			int rndNum = rnd.nextInt(45) + 1;
			if(i == 1) {
				System.out.println("첫째 자리 : " + rndNum);
			}
			if(i == 2) {
				System.out.println("둘째 자리 : " + rndNum);
			}
			if(i == 3) {
				System.out.println("셋째 자리 : " + rndNum);
			}
			if(i == 4) {
				System.out.println("넷째 자리 : " + rndNum);
			}
			if(i == 5) {
				System.out.println("다섯째 자리 : " + rndNum);
			}
			if(i == 6) {
				System.out.println("여섯쨰 자리 : " + rndNum);
			}
			
		}
		
		
		Random rnd2 = new Random();
		int rndNum2 = rnd2.nextInt(6) + 1;
		System.out.println(rndNum2);
	}
}
