package test.main;

public class MainClass05 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// double type 을 담을 수 있는 방
		// 10.1, 10.2, 10.3 을 순서대로 담아보세요
		
		// 방법1
		double[] d = { 10.1, 10.2, 10.3 };
		
		// 방법2
		double[] d2 = new double[3];
		d2[0] = 10.1;
		d2[1] = 10.2;
		d2[2] = 10.3;
	}
}
