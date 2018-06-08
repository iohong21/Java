package test.main;

class SubPerson{
	String name;
	protected SubPerson() {
		
	}
	protected SubPerson(String name) {
		this.name = name;
	}
	protected String getName() {
		return this.name.equals(null) ? "" : this.name;
	}
	protected void setName(String name) {
		this.name = name;
	}
}

public class zMainClass02 {
	public static void main(String[] args) {
		SubPerson p1 = new SubPerson("SHong");
		SubPerson p2 = new SubPerson("JoongKeun");
		
		System.out.println(p2.getName());
		System.out.println(p1.getName());
		
		MainClass01.a();
	}
}
