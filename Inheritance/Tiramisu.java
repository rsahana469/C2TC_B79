package org.tnsif.multilevelinheritance;
//Parent class(A)
public class Manager {
	
	//private members
	private String depatName;
	private String name;
	private int empId;
	
	//getters and setters
	public String getDepatName() {
		return depatName;
	}
	public void setDepatName(String depatName) {
		this.depatName = depatName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	//ToString() method
	@Override
	public String toString() {
		return "Manager [depatName=" + depatName + ", name=" + name + ", empId=" + empId + "]";
	}
	//Parameterized constructor
	public Manager(String depatName, String name, int empId) {
		super();
		this.depatName = depatName;
		this.name = name;
		this.empId = empId;
	}
	
	
}
