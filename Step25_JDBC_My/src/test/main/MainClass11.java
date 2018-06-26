package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 * MmeberDao 객체를 이용해서 1번회원의 정보를 얻어와서
		 * useDto() 메소드를 호출해 보세요
		 */
		useDto(MemberDao.getInstance().getData(1));
	}
	
	public static void useDto(MemberDto dto) {
		System.out.println(dto.getNum() + "|" + dto.getName() + "|" + dto.getAddr());
	}
}