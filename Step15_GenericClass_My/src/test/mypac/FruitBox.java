package test.mypac;

public class FruitBox<T> {
	private T item;
	
	public void Push(T item) {
		this.item = item;
	}
	
	public T Pull() {
		return this.item;
	}
}
