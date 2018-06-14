package test.mypac;

public class Gun {
	// 필드
	private Bullet bullet;
	
	// 생성자
	public Gun(Bullet bullet) {
		this.bullet = bullet;
	}
	
	public void fire() {
		if(this.bullet == null) {
			System.out.println("Bullet 객체가 없어요");
			return;
		}
		// 총을 발사 하는 메소드
		System.out.println("빵~");
	}
}
