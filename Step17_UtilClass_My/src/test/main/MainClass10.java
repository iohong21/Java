package test.main;

import java.util.*;

public class MainClass10 {
	@SuppressWarnings("unused")
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
		
//		members.add(addMember(1, "김구라", "노량진"));
//		members.add(addMember(2, "해골", "행신동"));
//		members.add(addMember(3, "원숭이", "동물원"));
		
		// 데이터 참조
		List<Map<String, Object>> a = members;
		Map<String, Object> b = members.get(0);
		int c = (int)members.get(0).get("num");
		String d = (String)members.get(0).get("name");
		String e = (String)members.get(0).get("addr");
	}
	static Map<String, Object> addMember(int num, String name, String addr) {
		Map<String, Object> m = new HashMap<>();
		m.put("num", num);
		m.put("name", name);
		m.put("addr", addr);
		
		return m;
	}
}
