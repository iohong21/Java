package test.mypac;
/*
 * [ 접근 지정자 (Access specifier) ]
 * 
 * 종류 : public, protected, default(작성안함경우), private
 * 
 * public => 어디서든 접근 가능
 * protected => 같은 package + 상속관계의 자식 클래스에서 접근 가능
 * default => 같은 package 내에서만 접근 가능
 * private => 같은 클래스 내에서만 접근 가능
 * 
 * 접근 지정자를 작성할 수 있는 위치 :
 * 1. 클래스 (public 또는 default 만 가능)
 * 2. 생성자 (public , protected , default , private )
 * 3. 필드 (public , protected , default , private )
 * 4. 메소드 (public , protected , default , private )
 */
public class Radio {
	// 필드
	public int volumn;
	
	// 생성자
	public Radio() {
		
	}
	
	// 메소드
	public void channelUp() {
		
	}
}
