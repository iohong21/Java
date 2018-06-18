package test.main;

import java.util.ArrayList;

import test.mypac.Person;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * String type 을 담을 수 있는 ArrayList 객체를 생성해서
		 * 문자열을 3개 저장해 보세요
		 */
		ArrayList<String> str = new ArrayList<>();
		str.add("서울");
		str.add("부산");
		str.add("대구");
		
		// Person type 을 담을 수 있는 ArrayList 객체를 생성해서 
		ArrayList<Person> p = new ArrayList<>();
		
		// Person 객체를 3개 저장해 보세요
		p.add(new Person());
		p.add(new Person());
		p.add(new Person());
	}
}
