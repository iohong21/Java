package test.main;

public class MainClass02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// int type 을 저장하고 있는 배열
		int[] nums = {10, 20, 30, 40, 50};
		// 0 번방 참조
		int a = nums[0];
		
		// 1번방 참조
		int b = nums[1];
		
		// 방의 크기 참조
		int size  = nums.length;
	}
}
