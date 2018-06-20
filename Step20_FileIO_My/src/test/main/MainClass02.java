package test.main;

import java.io.*;

import javax.swing.JOptionPane;

/*
 * 파일을 생성하는 예제
 */
public class MainClass02 {
	public static void main(String[] args) {
		String path = "c:/myFolder/gura.txt";
		File file1 = new File(path);
		
		if(file1.exists()) {
			JOptionPane.showMessageDialog(null, String.format("%1s 는 이미 존재합니다.", path));
			if(file1.isFile()) {
				System.out.println(path + "는 파일 입니다.");
			}
		} else {
			try {
				if(file1.createNewFile()) {
					JOptionPane.showMessageDialog(null, "파일을 생성했습니다.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
