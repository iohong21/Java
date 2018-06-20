package test.main;

import java.io.*;

public class MainClass06 {
	public static void main(String[] args) {
		final int EndOfRead = -1;
		String path = "c:/myFolder/monkey.txt";
		try {
			// file 에서 문자열을 읽어들일 FileReader 객체 생성
			FileReader fr = new FileReader(path);
			// 한번에 5글자를 담을 수 있는 char[] 객체 생성
			char[] buffer = new char[5];
			while(true) {
				// char[] 을 전달해서 읽어들이기
				// 읽은 문자의 갯수가 리턴된다.
				// 더 이상 읽을 문자가 없으면 -1 이 리턴된다.
				int readCount = fr.read(buffer); 
				if(readCount == EndOfRead) break;
				
				// 배열에 있는 모든 내용을 출력하기
				for(int i=0; i<readCount; i++) {
					char tmp = buffer[i];
					System.out.print(tmp);
				}
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
