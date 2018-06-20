package test.main;

import java.io.File;

import javax.swing.JOptionPane;

/*
 * c:\ 경로에 myFolder 라는 이름의 폴더를 만드는 예제
 * 
 * - 확인해서 myFolder 가 없으면 만들고 있으면 안만들기
 */
public class MainClass01 {
	public static void main(String[] args) {
		String path = "c:/myFolder";
		
		// File 객체 생성하면서 경로 전달
		File f = new File(path);
		
		if(f.exists()) {
			JOptionPane.showMessageDialog(null, String.format("%1s 는 이미 존재합니다.", path));
			if(f.isDirectory()) {
				System.out.println(path + "는 디렉토리 입니다.");
			}
		} else {
			f.mkdirs();
			JOptionPane.showMessageDialog(null, "폴더를 만들었습니다.");
		}
	}
}
