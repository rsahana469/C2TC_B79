package org.tnsif.statickeyword;

class Employee
{
	private int eid;
	private String ename;
	private static String cname="TNSIF";
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public static String getCname() {
		return cname;
	}
	public static void setCname(String cname) {
		Employee.cname = cname;
	}
	
	@SuppressWarnings("static-access")
	public void display()
	{
		System.out.println("empid=" + this.getEid()+ "\n"+"ename="+this.getEname()+"\n"+"comapny name="+this.getCname()+"\n\n");
	}
	
}

public class StaticVariable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("Sakshi Rahane");
		e.display();
		
		Employee e1=new Employee();
		e.setEid(2);
		e.setEname("Karuna Pawar");
		e.display();
		
		Employee e2=new Employee();
		e.setEid(3);
		e.setEname("Snehal Darade");
		e.display();
		
	}

}
