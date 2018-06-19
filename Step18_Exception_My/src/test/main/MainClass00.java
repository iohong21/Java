package test.main;

import java.util.*;

enum ShowType {
	All,
	Even,
	Odd,
}
public class MainClass00 {
	enum RunType { 
		First, 
		Second,
	};
	public static void main(String[] args) {
		RunType runCase = RunType.Second;
		
		switch(runCase) {
			case First:
				Runnable r = new myThread("My Thread");
				Thread t = new Thread(r);
				t.start();
				break;
				
			case Second:
				myThread2 myT = new myThread2("My Thread");
				myT.start();
				break;
		}
	}
}

class showNum {
	public showNum(String threadName, ShowType showType) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		list.forEach(value -> {
			switch(showType) {
				case All:
					System.out.println(String.format("[%1s]결과: %2d", threadName, value));
					break;
					
				case Even:
					if(isEven(value)) {
						System.out.println(String.format("[%1s]결과: %2d", threadName, value));
					}
					break;
					
				case Odd:
					if(!isEven(value)) {
						System.out.println(String.format("[%1s]결과: %2d", threadName, value));
					}
					break;
			}
		});
	}
	
	static boolean isEven(int n) {
		return n % 2 == 0;
	}
}

class myThread implements Runnable {
	private final String threadName;
	
	public myThread() {
		this.threadName = "myThread";
	}
	public myThread(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		new showNum(threadName, ShowType.All);
	}
}

class myThread2 extends Thread {
	private final String threadName;
	
	public myThread2() {
		this.threadName = "myThread2";
	}
	public myThread2(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		new showNum(threadName, ShowType.All);
	}
}
