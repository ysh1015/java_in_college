
public class StringBuilderDemo {

	public static void main(String[] args) {

		String data = new StringBuilder()
				// 메서드 체이팅 패턴
				.append("DEF") // 문자열을 끝에 추가 
				.insert(0, "ABC") // 문자열을 지정 위치에 추가 
				.delete(3,  4) // 문자열 일부를 삭제 (시작위치, 끝위치)
				.toString(); // 완성된 문자열을 리턴
		
		System.out.println(data);
		
	}
}
