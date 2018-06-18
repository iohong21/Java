package test.main;

import java.util.List;
import java.util.ArrayList;

import test.mypac.MemberDto;

public class MainClass07 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * 1. MemberDto type 을 담을 ArrayList 객체를 생성
		 * 2. 3 명의 회원정보를 각각 MemberDto 객체에 담아서
		 * 3. MemberDto 객체의 참조값을 ArrayList 객체에 저장하기
		 *    
		 */
		List<MemberDto> members = new ArrayList<>();
		
//		mems.add(addMember(1, "호배", "서울"));
//		mems.add(addMember(2, "정식", "부산"));
//		mems.add(addMember(3, "석봉", "대구"));
		MemberDto m1 = new MemberDto(1, "호배", "서울" );
		MemberDto m2 = new MemberDto(2, "정식", "부산");
		MemberDto m3 = new MemberDto(3, "석봉", "대구");

		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		// 참조 연습
		List<MemberDto> a = members;
		MemberDto b = members.get(0);
		int c = members.get(0).getNum();
		String d = members.get(0).getName();
		String e = members.get(0).getAddr();
	}
	
	static MemberDto addMember(int num, String name, String addr) {
		return new MemberDto(num, name, addr);
	}
}
