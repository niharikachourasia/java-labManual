package assignment;

public class Entry {
	public static void main(String args[]) {
		
		Employee e = new Employee();
		e.setName("nikki");
		
		Address a = new Address();
		a.setLine("abc road");
		e.setAddress(a);
		
		Country c = new Country();
		c.setName("India");
		a.setCountry(c);
		
		City ct = new City();
		ct.setName("kolkata");
		c.setCity(ct);
		e.display(e);
	   
		
	/*	System.out.println("Employee Name:-"+ e.getName());
		System.out.println("Employee Address:-"+ e.getAddress().getLine());
		System.out.println("Employee Country:-"+ a.getCountry().getName());
		System.out.println("Employee city:-"+ c.getCity().getName());
		System.out.println("--------------------------------------------------------------");
	*/
		
		
		e.setName("tina");
		a.setLine("xyz road");
		e.setAddress(a);
		c.setName("India");
		a.setCountry(c);
		ct.setName("jaipur");
		c.setCity(ct);
		e.display(e);
		
	/*System.out.println("Employee Name:-"+ e.getName());
		System.out.println("Employee Address:-"+ e.getAddress().getLine());
		System.out.println("Employee Country:-"+ a.getCountry().getName());
		System.out.println("Employee city:-"+ c.getCity().getName());
		System.out.println("--------------------------------------------------------------");
	*/	

		
		
		e.setName("laveena");
		a.setLine("capgemini road");
		e.setAddress(a);
		c.setName("India");
		a.setCountry(c);
		ct.setName("pune");
		c.setCity(ct);
		e.display(e);
	/*System.out.println("Employee Name:-"+ e.getName());
		System.out.println("Employee Address:-"+ e.getAddress().getLine());
		System.out.println("Employee Country:-"+ a.getCountry().getName());
		System.out.println("Employee city:-"+ c.getCity().getName());
		System.out.println("--------------------------------------------------------------");

		*/
	}
	/*public void display(Employee e){
		System.out.println("Employee Name:-"+ e.getName());
		System.out.println("Employee Address:-"+ e.getAddress().getLine());
		System.out.println("Employee Country:-"+ e.getAddress().getCountry().getName());
		System.out.println("Employee city:-"+ e.getAddress().getCountry().getCity().getName());
		System.out.println("--------------------------------------------------------------");
		
	}
*/
}
