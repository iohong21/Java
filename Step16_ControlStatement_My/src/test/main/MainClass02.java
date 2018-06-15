package test.main;

public class MainClass02 {
	// 무기의 상태값을 정의한 상수
	public enum weapon{
		SWORD,
		GUN,
		ARROW,
		FIST
	}
	
	public static void main(String[] args) {
		//무기의 현재 상태값
		weapon weaponState = weapon.GUN;

		if(weaponState == weapon.SWORD){
			System.out.println("칼로 공격해요");
		}else if(weaponState == weapon.GUN){
			System.out.println("총으로 공격해요");
		}else if(weaponState == weapon.ARROW){
			System.out.println("활로 공격해요");
		}else if(weaponState == weapon.FIST){
			System.out.println("주먹으로 공격해요");
		}else{
			System.out.println("무기가 선택되지 않아서 공격할수 없음");
		}
	}
}
