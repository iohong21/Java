package test.main;

import java.util.ArrayList;

public class MainClass02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 정수를 저장할 수 있느 가변 배열 객체 생성
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		// 0 번방 참조
		int num1 = nums.get(0);
		
		// 1 번방 참조
		int num2 = nums.get(1);
		
		// 2 번방 참조
		Integer num3 = nums.get(2);
		
		// 2 번장 삭제
		nums.remove(2);
		
		// 방의 크기 참조
		int size = nums.size();
		
		// 모든 방 삭제
		nums.clear();
	}
}
