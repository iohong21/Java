package test.main;

import java.io.*;

/*
 * 텍스트 파일에 문자열 출력하는 예제
 */
public class MainClass03 {
	public static void main(String[] args) {
		String path = "c:/myFolder/gura.txt";
		File file1 = new File(path);
		
		try {
			FileWriter fw = new FileWriter(file1);
			fw.write("안녕하세요");
			fw.write("\r\n");
			fw.write("Hello Mr. Monkey");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
