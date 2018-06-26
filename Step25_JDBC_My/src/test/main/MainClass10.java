package test.main;

import test.dao.MemberDao;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * MemberDao 객체를 이용해서
		 * 3번 회원의 정보를 삭제해 보세요
		 */
		if(MemberDao.getInstance().delete(4)) {
			System.out.println("삭제 되었습니다.");
		}
	}
}