package ComparableEntity;

public class Registeration implements Comparable<Registeration> {
	private int registerationNo;
	private String name;
	private String dept;
	private String address;
	public Registeration(int registerationNo, String name, String dept, String address) {
		
		this.registerationNo = registerationNo;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	public int getRegisterationNo() {
		return registerationNo;
	}
	public void setRegisterationNo(int registerationNo) {
		this.registerationNo = registerationNo;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

@Override
	public String toString() {
		return "Registeration [registerationNo=" + registerationNo + ", name=" + name + ", dept=" + dept + ", address="
				+ address + "]";
	}
@Override
public int compareTo(Registeration r1) {
if(registerationNo==r1.registerationNo)
{
	return 0;
}
else if(registerationNo>r1.registerationNo)
{
	return 1;
}
	return -1;
}


	
	
	
	

}
