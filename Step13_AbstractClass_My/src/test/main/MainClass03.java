package test.main;

import test.mypac.Weapon;

public class MainClass03 {
	public static void main(String[] args) {
		Weapon w1 = new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격");
			}
		};
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격2");
			}
		});
	}

	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
