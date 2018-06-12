package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		// 1. String type  을 담을 수 있는 방5개 짜리 배열객체를 생성
		String[] str = new String[5];
		
		// 2. 배열의 5개의 방에 각각 다른 문자열 저장하기
		str[0] = "A";
		str[1] = "B";
		str[2] = "C";
		str[3] = "D";
		str[4] = "E";
		
		// 3. 반복문 for 를 이용해서 5개으 ㅣ방에 있는 문자열을
		//    순서대로 콘솔창에 출력하기
		for(int i=0; i<str.length; i++) {
			String tmp = str[i];
			System.out.println("결과: " + tmp);
		}
	}
}
