package example2;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("전송할 메세지 입력: ");
		String msg = scan.nextLine();
		
		Socket socket = null;
		BufferedWriter bw = null;
		try {
			// new Socket (서버의 ip, port 번호)
			socket = new Socket("192.168.0.73", 5000);
			System.out.println("연결 성공!");
			// 클라이언트에게 문자열을 출력할 수 있는 객체의 참조값
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write(msg);	// 문자열 출력
			bw.newLine();	// 개행기호 출력
			bw.flush();		// 방출(전송)
			System.out.println("서버에 문자열 전송 완료");
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(socket != null) {
					if(!socket.isClosed()) socket.close();
				}
			} catch(Exception ex) {
				ex.printStackTrace();	
			}
		}
	}
}
