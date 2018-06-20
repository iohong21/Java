package test.main;

import java.io.*;

/*
 * 텍스트 파일에 문자열 출력하는 예제
 */
public class MainClass00 {
	public static void main(String[] args) {
		String path = "c:/myFolder/monkey2.txt";
		
		try {
			String ws = "We are the world\r\n";
			byte[] b = ws.getBytes();
			
			FileOutputStream fos = new FileOutputStream(path, true);
			try {
				fos.write(b, 0, b.length);
				fos.flush();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
