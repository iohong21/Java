package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass06 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		
		// Generic 은  Object 이지만  Car 객체를 담을 수 있다.
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		
		// 0  번방 참조
		Object car1 = list.get(0);
		
		// 1 번방 참조 (casting 하면 Car type 으로 받을 수 있다).
		Car car2 = (Car)list.get(1);
		
		/*
		List<String> strs = new ArrayList<>();
		strs.add("대구");
		strs.add("서울");
		strs.add("부산");
		
		//Collections.sort(strs, Collections.reverseOrder());
		Collections.sort(strs);
		for(String s : strs) {
			System.out.println(s);
		}
		
		try {
			System.out.println(java.net.InetAddress.getByName("google.com").getHostAddress());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		*/
	}
}
