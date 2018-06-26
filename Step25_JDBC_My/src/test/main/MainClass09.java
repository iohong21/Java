package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * MemberDao 객체를 이용해서
		 * 2번 회원의 정보를 다음과 같이 수정해 보세요.
		 * 
		 * 이름 : 이주환
		 * 주소 : 상도동
		 */
		if(MemberDao.getInstance().update(new MemberDto(2, "이주환", "상도동"))) {
			System.out.println("변경 성공");
		}
	}
}