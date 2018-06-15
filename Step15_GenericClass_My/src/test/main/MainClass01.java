package test.main;

import test.mypac.*;

public class MainClass01 {
//	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Apple 객체를 담을려면 ?
		AppleBox box1 = new AppleBox();
		box1.push(new Apple());
		
		// Banana 객체를 담을려면
		BananaBox box2 = new BananaBox();
		box2.push(new Banana());
		
		// Orange 객체를 담을려면
		OrangeBox box3 = new OrangeBox();
		box3.push(new Orange());
	}
}
