package EntityArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Registeration{
	private int registerNo;
	private String name;
	private String dept;
	public Registeration(int registerNo, String name, String dept) {
		
		this.registerNo = registerNo;
		this.name = name;
		this.dept = dept;
	}
	public int getRegisterNo() {
		return registerNo;
	}
	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
    public static void displaySortByName(List<Registeration> registeration) {
    	registeration.sort(Comparator.comparing(Registeration::getName),Collections.reverseOrder());
        for (Registeration regi : registeration) {
            System.out.println(regi);
        }

    }

}
