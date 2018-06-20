package test.main;

import java.io.*;

public class MainClass071 {
	public static void main(String[] args) {
		String path = "c:/myFolder/monkey.txt";
		FileReader fr = null;
		BufferedReader br = null; 
		try {
			// file 에서 문자열을 읽어들일 FileReader 객체 생성
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			while(true) {
				// BufferedReader 객체를 이용해서 한줄 읽어들이기
				String line = br.readLine();
				if(line == null) break;

				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 마무리 작업
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
