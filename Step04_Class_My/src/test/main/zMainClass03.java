package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.AttackUnit;
import test.mypac.zPerson;

public class zMainClass03 {
	static List<zPerson> man = new ArrayList<zPerson>();
	public static void main(String[] args) {
		
		SetData(1, "SHong", "010-1111-1111", "Seoul");
		SetData(2, "Kim", "010-2222-2222", "Busan");
		
		ViewData();
	}
	
	protected static void SetData(int id, String name, String phone, String addr) {
		zPerson info = new zPerson();
		info.setID(id);
		info.setName(name);
		info.setPhone(phone);
		info.addr(addr);
		man.add(info);
	}
	
	protected static void ViewData() {
		for(zPerson p : man) {
			System.out.println(p.getName());
		}
	}
}
