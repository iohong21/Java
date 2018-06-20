package test.main;

import java.io.*;

public class MainClass071x {
	public static void main(String[] args) throws IOException {
		String path = "c:/myFolder/monkey.txt";
		// file 에서 문자열을 읽어들일 FileReader 객체 생성
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			// BufferedReader 객체를 이용해서 한줄 읽어들이기
			String line = br.readLine();
			if(line == null) break;

			System.out.println(line);
		}
		br.close();
		fr.close();
	}
}
