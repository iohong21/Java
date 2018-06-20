package test.main;

import java.io.*;

public class MainClass07 {
	public static void main(String[] args) {
		String path = "c:/myFolder/monkey.txt";
		try {
			// file 에서 문자열을 읽어들일 FileReader 객체 생성
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			System.out.println(line);
			
			// 마무리 작업
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
