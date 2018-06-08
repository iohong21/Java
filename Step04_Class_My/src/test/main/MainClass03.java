package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.AttackUnit;
import test.mypac.Person;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		AttackUnit unit = new AttackUnit();
		unit.attack();
		unit.attack();
		unit.attack();
		
		// AttackUnit 클래스로 새로운 객체를 생성해서
		// attack() 메소드를 3번 호출해보세요
		AttackUnit unit2 = new AttackUnit();
		unit2.attack();
		unit2.attack();
		unit2.attack();
		*/
		List<Person> man = new ArrayList<Person>();
		Person info = new Person();
		info.setID(1);
		info.setName("SHong");
		info.setPhone("010-1111-1111");
		man.add(info);
		
	}
}
