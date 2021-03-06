package test.main;

import test.mypac.AttackUnit;

public class MainClass06 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//1. AttackUnit type의 참조값을 담을 변수 만들기 (null)
		AttackUnit unit1 = null;
		
		//2. 위에서 만든 변수에 AttackUnit 객체를 생성해서 참조값 담기
		unit1 = new AttackUnit();
		
		//3. move() 메소드 호출하기
		unit1.attack();
		
		//4. energy 라는 필드에  저장된 값을 a 라는 이름의 지역변수에 담기
		int a = unit1.energy;
		
		//5. energy 라는 필드에 50을 대입해 보세요
		unit1.energy = 50;
	}
}
