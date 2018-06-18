package test.main;

import java.util.List;
import java.util.ArrayList;

import test.mypac.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		// 1.
		List<MemberDto> members = new ArrayList<>();

		// 2.
		MemberDto dto1 = new MemberDto(1, "김구라", "노량진" );
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		MemberDto dto3 = new MemberDto(3, "원숭이", "동물원");

		// 3.
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		// 4. members 에 들어 있느 회원정보를 for 문을 이요해서
		//    순서대로 콘솔창에 출력해 보세요.
		//    [ 출력 형식 ]
		//    번호:1 이름:김구라 주소:노량진 
		//    번호:2 이름:해골 주소:행신동 
		//    번호:3 이름:원숭이 주소:동물원
		for(MemberDto m : members) {
//			System.out.println("번호:"+m.getNum()+" 이름:"+m.getName()+" 주소:"+m.getAddr());
			System.out.println(String.format("번호:%1s 이름:%2s 주소:%3s", m.getNum(), m.getName(), m.getAddr()));
		}
	}
}
