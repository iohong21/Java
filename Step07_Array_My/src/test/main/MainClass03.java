package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// String type을 담을수 있ㄴ느 방5개 짜리 배열객체 생성해서
		// 참조갓을 변수에 담기
		// 5 개의 방에는 null이 들어있다.
		String[] names = new String[5];
		// 0 번방에 String type 대입
		names[0] = "김구라";
		// 1 번방에 String type 대입
		names[1] = "해골";
		// 2번방에 String type
		names[2] = "원숭이";
		
		// 방의 크기 참조
		int size = names.length; 		// 1 / 5
				
	}
}
