import java.util.*;

public class RandomExample {

	public static void main(String[] args) {

		// seed 값이 동일하면 계속 똑같은 숫자만 나온다.
		Random rnd = new Random();
		
		for(int i = 1; i <= 6; i++) {
			int rndNum = rnd.nextInt(45) + 1;
			System.out.println(rndNum);
		}
		
	}
}
