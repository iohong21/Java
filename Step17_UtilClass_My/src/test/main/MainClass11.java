package test.main;

import java.util.*;

//import test.mypac.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		// Map<String, Object> 를 저장할 ArrayList 객체를 생성 해서
		// 참조값을 members 라는 변수에 담아보세요.
		List<Map<String, Object>> members = new ArrayList<>();
		
		// 회원3명의 정보를 담아 보세요
		Map<String, Object> m1 = new HashMap<>();
		m1.put("num", 1);
		m1.put("name", "김구라");
		m1.put("addr", "노량진");
		members.add(m1);
		
		Map<String, Object> m2 = new HashMap<>();
		m2.put("num", 2);
		m2.put("name", "해골");
		m2.put("addr", "행신동");
		members.add(m2);
		
		Map<String, Object> m3 = new HashMap<>();
		m3.put("num", 3);
		m3.put("name", "원숭이");
		m3.put("addr", "동물원");
		members.add(m3);

		// for 문을 잉요해서 members 에 있는 회원정보를 
		// 콘솔창에 출력해보세요
		//    [ 출력 형식 ]
		//    번호:1 이름:김구라 주소:노량진 
		//    번호:2 이름:해골 주소:행신동 
		//    번호:3 이름:원숭이 주소:동물원
		for(Map<String, Object> m : members) {
//			System.out.println("번호:"+(int)m.get("num")+" 이름:"+(String)m.get("name")+" 주소:"+(String)m.get("addr"));
			System.out.println(String.format("번호:%1d 이름:%2s 주소:%3s", (int)m.get("num")
																	  , (String)m.get("name")
																	  , (String)m.get("addr")));
		}
		
	}
}
