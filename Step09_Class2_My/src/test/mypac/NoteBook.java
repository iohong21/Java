package test.mypac;

public class NoteBook {
	// 필드
	@SuppressWarnings("unused")
	private Cpu cpu;
	@SuppressWarnings("unused")
	private Memory memory;
	
	// 생성자
	public NoteBook(Cpu cpu, Memory memory) {
		this.cpu = cpu;
		this.memory = memory;
	}
}
