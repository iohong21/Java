package example2;

import java.io.*;
import java.net.*;

public class ServerMain {
	public static void main(String[] args) {
		// 필요한 객체를 담을 변수 만들기
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			// 5000번 port 에서 클라이언트의 접속을 기다릴 수 있는
			// ServerSocket 객체 생성해서 참조값ㅇ르 변수에 담기
			serverSocket = new ServerSocket(5000);
			while(true) {
				socket = serverSocket.accept();
				System.out.println("클라이언트가 접속함!");
				
				// socket 변수안에는 방금 연결 요청을 한
				// 클라이언트와 연결된 Socket 객체의 참조값이 들어있다.
				String ip = socket.getInetAddress().getHostAddress();
				
				// 클라이언트가 전송하는 데이터를 읽어들일 수 있는 객체
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				// 클라이언트가 전송한 문자열 읽어내기
				String msg = br.readLine();
				
//				DataInputStream dis = new DataInputStream(is);
//				String msg = dis.readUTF();
				// 콘솔창에 출력하고
				System.out.println(ip + " : " + msg);
				//Socket 객체 닫기
				socket.close();
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch(Exception ex) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
