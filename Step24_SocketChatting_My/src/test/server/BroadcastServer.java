package test.server;

import java.io.*;
import java.net.*;
import java.util.*;


/*
 * [ 문자열 전송 약속 ]
 * 
 * 0#id 				=> 새로운 클라이언트 접속 메시지
 * 1#id#message			=> 대화 메시지
 * 2#id					=> 대화방 탈퇴 메시지
 * 3#id1,id2,id3,...	=> 대화 참여자 목록 메시지
 */
public class BroadcastServer {
	private static List<ServerThread> threadList = new ArrayList<>();
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5000);
			while(true) {
				System.out.println("클라이언트의 접속 대기중...");
				Socket socket = serverSocket.accept();
				
				// 스레드 객체 생성
				ServerThread thread = new ServerThread(socket);

				// 스레드를 시작 시킨다.
				thread.start();

				threadList.add(thread);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(serverSocket != null) {
				try {
					if(!serverSocket.isClosed()) serverSocket.close();
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
	// 스레드 객체를 생성할 클래스 설계
	static class ServerThread extends Thread {
		// 필드
		private Socket socket = null;
		private BufferedReader br;
		private BufferedWriter bw;
		private String id; // 대화명
		
		// 생성자
		public ServerThread(Socket socket) {
			// 생성자의 인자로 전달된 Socket 객체를 필드에 저장
			this.socket = socket;
		}
		
		void ClientSocketClose(Socket s) {
			if(s != null) {
				try {
					if(!s.isClosed()) s.close();
				} catch(Exception ex) {}
			}
		}
		
		@Override
		public void run() {
			try {
				// 클라이언트가 전송한 문자열을 읽을 객체
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// 클라이언트에게 문자열을 출력할 객체
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				boolean isRun = true;
				while(isRun) {
					String msg = null;
					try {
						// 클라이언트의 문자 전송을 기다린다
						msg = br.readLine();
					} catch(SocketException se) {
						se.printStackTrace();
						msg = null;
					}
					if(msg == null) {	// 접속이 끊긴 경우
						// 배열에서 해당 스레드 제거
						ClientSocketClose(socket);
						threadList.remove(this);
						
						// 반복문 탈출 하도록
						isRun = false;
						
						// 수정된 참여자 목록 보내기
						sendClientList();
					} else {	// 도착한 메시지가 있는 경우
						// #으로 구분해서 문자열을 배열로 읽어온다.
						String[] result = msg.split("#");
						
						if(result.length > 0) {
							int msgType = Integer.parseInt(result[0]);
							switch(msgType) {
							case 0:	// 새로운 대화 참여자 입자
								id = result.length > 1 ? result[1] : "익명";
								sendClientList();
								break;
								
							case 1: // 새로운 대화 메시지 도착
								// 메세지 보내기
								sendMessage(msg);
								break;
								
							case 2:	// 대화 참여자 탈퇴
								sendMessage(msg);
								
								// 스레드 목록에서 삭제
								ClientSocketClose(socket);
								threadList.remove(this);
								
								// 스레드 종료
								isRun = false;
								
								// 대화 참여자 목록 다시 보내기
								sendClientList();
								break;
							}
						} else {
							System.out.println("오류 data");
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(br != null) br.close();
					if(bw != null) bw.close();
					if(socket != null) {
						if(!socket.isClosed()) socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// 새로운 참여자가 들어왔을때 처리하는 메소드
		public void sendClientList() throws IOException {
			// 이베트의 종류
			String data = "3";
			for(int i=0; i<threadList.size(); i++) {
				// i 번쨰 스레드의 참조값 얻어오기
				ServerThread tmp = threadList.get(i);
				if(i == 0) {	// 처음 반복문을 도는 것이라면
					data += ("#" + tmp.id);
				} else {
					data += ("," + tmp.id);
				}
			}
			// 반복문 돌고 나면 data는 "3#김구라,해골,원숭이 ... 
			// 와 같은 형태의 문자열이다
			// 모든 클라이언트에게 data 보내기
			sendMessage(data);

//			boolean isFirst = true;
//			for(ServerThread tmp : threadList) {
//				data += ((isFirst ? "#" : ",") + tmp.id);
//				isFirst = false;
//			}
		}
		
		// 모든 클라이언트에게 문자열을 보내는 메소드
		public void sendMessage(String msg) throws IOException {
			for(ServerThread tmp : threadList) {
				tmp.bw.write(msg);
				tmp.bw.newLine();
				tmp.bw.flush();
			}
		}
	}
}
