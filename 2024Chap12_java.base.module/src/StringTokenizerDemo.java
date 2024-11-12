import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String token = "홍길동,이수홍,박연수";
		
		StringTokenizer st = new StringTokenizer(token, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
}
