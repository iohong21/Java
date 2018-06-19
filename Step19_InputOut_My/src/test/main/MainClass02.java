package test.main;

import java.io.*;

/*
 * [ InputStreamReader ]
 * 
 * - 2byte 처리 스트림 (256 x 256 = 65536 가지)
 * - 한글 처리 가능
 */
public class MainClass02 {
	public static void main(String[] args) {
		InputStream is = System.in;
		
		// 키보드와 연결된 InputStream 객체의 참조값을 생성자의 인자로
		// 전달하면서 InputStreamReader 객체 생성해서 참조값 변수에 담기
		InputStreamReader isr = new InputStreamReader(is);
		
		try {
			System.out.print("한글자 입력: ");
			int code=isr.read();
			System.out.println("code: " + code);

			char ch = (char)code;
			System.out.println("입력한 글자: " + ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
