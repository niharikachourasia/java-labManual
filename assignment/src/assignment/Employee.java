package assignment;

public class Employee {
	private String name;
	private Address address;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display(Employee e){
		System.out.println("Employee Name:-"+ e.getName());
		System.out.println("Employee Address:-"+ e.getAddress().getLine());
		System.out.println("Employee Country:-"+ e.getAddress().getCountry().getName());
		System.out.println("Employee city:-"+ e.getAddress().getCountry().getCity().getName());
		System.out.println("--------------------------------------------------------------");
		
	}

}
