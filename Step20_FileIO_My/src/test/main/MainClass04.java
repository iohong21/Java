package test.main;

import java.io.*;

/*
 * 텍스트 파일에 문자열 출력하는 예제
 */
public class MainClass04 {
	public static void main(String[] args) {
		String path = "c:/myFolder/monkey.txt";
		
		try {
			// true 는 append mode  
			// true가 없으면 overwrite mode
			FileWriter fw = new FileWriter(path, true);		
			fw.write("어제는 바람찬 강변을 나 홀로 걸었오\r\n");
			fw.write("강 건너 저끝에 있는\r\n");
			fw.write("수 많은 조약돌 처럼\r\n");
			fw.write("당신과 나 사이엔 사연도 참 많았소\r\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
