package DataEncapsulation;

public class Registeration {
	private int registerNumber;
	private String studentName;
	private long mobileNo;
	private int employeeSalary;
	
	
	

	public Registeration() {
		
	}
	public Registeration(int registerNumber, String studentName, long mobileNo, int employeeSalary) {
		
		this.registerNumber = registerNumber;
		this.studentName = studentName;
		this.mobileNo = mobileNo;
		this.employeeSalary = employeeSalary;
	}
	public int getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	
	
	
	
	
	
	

}
