package test.main;

import java.io.*;

public class MainClass10 {
	public static void main(String[] args) {
		// 필요한 지역변수 미리 만들기
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 미리 만든 지역변수에 참조값 대입
			fr = new FileReader("c:/myFolder/monkey.txt");
			br = new BufferedReader(fr);
			
			// 문자열을 누적시킬 StringBuilder 객체
			StringBuilder builder = new StringBuilder();
			
			while(true) {
				String line=br.readLine();
				if(line == null) {
					break;
				}
				
				// 읽은 문자열 누적 시키기
				builder.append(line);
				builder.append("\r\n");		// 개행기호
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch(Exception ex) {};
		}
	}
}
