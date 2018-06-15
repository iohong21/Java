package test.main;

import test.mypac.*;

public class MainClass02 {
	public static void main(String[] args) {
		// Apple 객체를 담을 수 있는 FruitBox 객체 생성
		FruitBox<Apple> abox = new FruitBox<Apple>();
		abox.Push(new Apple());
		
		// Banana 객체를 담을 수 있는 FruitBox 객체를 생성해서
		// Banana 객체를 담아보세요
		FruitBox<Banana> bBox = new FruitBox<Banana>();
		bBox.Push(new Banana());
		
		// 객체를 new 할때 Generic type 은 생략 가능
		FruitBox<Orange> oBox = new FruitBox<>();
		oBox.Push(new Orange());
	}
}
