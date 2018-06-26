package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

/*
 *  JDBC (Java Database Connectivity) 
 *  
 *  - java 에서의 DataBase 연동 프로그래밍 연습
 *  - Oracle Database 를 연동하려면 ojdbc6.jar 파일이 사용가능한
 *    위치에 있어야 한다. DB 연동하기 위한 드라이버 클래스가 
 *    ojdbc6.jar 파일에 들어 있다. 
 */
public class MainClass08 {
	public static void main(String[] args) {
		// DB 에 저장할 회원 정보라고 가정!
		int num = 4;
		String name = "주뎅이";
		String addr = "갈현동";

		// MemberDao 객체의 참조값 얻어와서
		MemberDao dao = MemberDao.getInstance();
		
		int no = 1;
		
		switch(no) {
		case 1:
			if(dao.insert(new MemberDto(num, name, addr))) {
				System.out.println("자료를 추가 하였습니다.");
			}
			break;
			
		case 2:
			if(dao.update(new MemberDto(num, "Happy", "new year"))) {
				System.out.println("자료를 변경 하였습니다.");
			}
			break;
			
		case 3:
			if(dao.delete(num)) {
				System.out.println("자료를 삭제 하였습니다.");
			}
			break;
			
		case 4:
			MemberDto dto = dao.getData(2);
			if(dto != null) {
				System.out.println(dto.getNum() + " | " + dto.getName() + " | " + dto.getAddr());
			}
			break;
			
		case 5:
			// 회원정보 가져오기
			List<MemberDto> lists = dao.getList();
			if(lists.size() > 0) {
				System.out.println("      [ 조회결과 ]");
				System.out.println("======================");
				System.out.println("  순번          성명        주소");
				System.out.println("======================");
				for(MemberDto list : lists) {
//					System.out.println(dto5.getNum() + " | " + dto5.getName() + " | " + dto5.getAddr());
					int nSize = 15 - (list.getName().length()*2);
					System.out.println(String.format("%4d     %-" + nSize + "s%-8s", list.getNum(), list.getName(), list.getAddr()));
				}
			}
			break;
		}
	}
}