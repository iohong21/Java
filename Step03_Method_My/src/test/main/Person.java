package test.main;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private int id;
	private String name;
	private String addr;
	
	public int getID() {
		return this.id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return this.addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
class PersonData {
	private List<Person> data = new ArrayList<Person>();
	
	public boolean isEmpty() {
		return data.size() == 0;
	}
	public int Length() {
		return data.size();
	}
	public void Push(Person p) {
		data.add(p);
	}
	public Person Pop() {
		return isEmpty() ? null : data.get(data.size()-1);
	}
	public Person Get(int key) {
		for(Person p : data) {
			if(p.getID() == key) {
				return p;
			}
		}
		return null;
	}
}
