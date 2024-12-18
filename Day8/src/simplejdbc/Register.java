package simplejdbc;

public class Register {
	private int registerNo;
	private String name;
	private String dept;
	public Register() {

	}
	public Register(int registerNo, String name, String dept) {
		super();
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
	
	
	
	
	
	
	

}
