package test.main;

//@SuppressWarnings("unused")
public class MainClass03 {
	// Inner Class
	class Gura{
		
	}
	public static void main(String[] args) {
		/*
		 * 메소드 안에 클래스를 정의할 수도 있다.
		 * 
		 * Local Inner Class
		 */
		class Car{
			public void drive() {
				System.out.println("달려요");
			}
		}
		
		// 객체 생성후
		Car car = new Car();
		
		// 메소드 호출 가능
		car.drive();
	}
}
