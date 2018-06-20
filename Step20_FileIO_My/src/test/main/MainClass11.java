package test.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		String sFile = "c:/myFolder/myImage.jpg";
		String tFile = "c:/myFolder/copiedImage.jpg";
		
		File sourFile = new File(sFile);
		if(!sourFile.exists()) {
			System.out.println(sFile + " 파일이 존재하지 않습니다");
			return;
		}
		
		File destFile = new File(tFile);
		if(destFile.exists()) {
			System.out.println(tFile + " 파일이 이미 존재합니다");
			return;
		}
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//파일에서 입력 받을수 있는 스트림 객체 
			fis=new FileInputStream(sFile);
			//파일에 출력할수 있는 스트림 객체 
			fos=new FileOutputStream(tFile);
			
			//byte[] 배열객체 생성
			byte[] buffer=new byte[1024]; 
			
			//반복문 돌면서 byte[] 객체를 이용해서 읽어들이고 
			while(true){
				int readedCount=fis.read(buffer);
				
				//더이상 읽을게 없으면 반복문 탈출
				if(readedCount==-1)break;
				//읽은 만큼 파일에 출력하기
				fos.write(buffer, 0, readedCount);
				fos.flush();
			}
			System.out.println("파일을 복사 했습니다.");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//finally 절에서 마무리 작업
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
