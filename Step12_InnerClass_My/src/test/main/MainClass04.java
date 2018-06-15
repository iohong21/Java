package test.main;

import test.mypac.BoxFactory;
import test.mypac.BoxFactory.Box;

public class MainClass04 {
	public static void main(String[] args) {
		BoxFactory b = new BoxFactory();

		Box box = b.getBox();
		box.useBox();
	}
}
