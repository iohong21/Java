package test.main;

import java.util.*;

/*
 * [ HashSet ]
 * 
 * - 순서가 없다
 * - 키값도 없다
 * - 중복을 허용하지 않는다.
 * - 집합의 개념으로 데이터를 관리하고 싶을때 사용한다.
 * - Set 인터페이스를 구현 했다.
 */
public class MainClass12 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 HashSet 객체
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(20);
		set1.add(40);
		set1.add(50);
		
		/*
		 * HashSet 객체에 있는 모든 숫자를 콘솔에 출력해 보세요.
		 * 
		 */
		Iterator<Integer> setData = set1.iterator(); 
		while(setData.hasNext()) {
			System.out.println("결과: " + setData.next());
		}
		
		System.out.println("-- for 문 --");
		
		for(Integer n : set1) {
			System.out.println("결과2: " + n);
		}
		
		System.out.println("-- forEach 문 --");
		set1.forEach((Integer n)->System.out.println(n));
	}
}
