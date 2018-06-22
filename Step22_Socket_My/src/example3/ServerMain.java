package example3;

import java.net.*;

public class ServerMain {
	public static void main(String[] args) {
		// 필요한 객체를 담을 변수 만들기
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(5000);
			while(true) {
				Socket socket = serverSocket.accept();
				Thread t = new ServerThread(socket);
				t.start();
				System.out.println("클라이언트가 접속함!");
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(serverSocket != null) serverSocket.close();
			} catch(Exception ex) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
