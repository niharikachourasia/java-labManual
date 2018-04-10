import java.util.Date;
import static java.lang.System.out;
class Emp2{
public static void main(String[] args){
		System.out.println("The details of the employee are as follows:");
		Date dt = new Date();
		//out.println("Current date: "+ dt);
		
		EmployeeDetail e = null;
		
		//c = new Customer();
		//c.displayDetails();

		e = new EmployeeDetail("laveena", "agarwal", 500000, "a", dt);
		//count=count+1;
		e.displayDetails();
		
		e = new EmployeeDetail("nikki", "chourasia", 1900000, "a", dt);
	//	count=count+1;
		e.displayDetails();
		
		e = new EmployeeDetail("teena", "bodhwani", 30000, "b", dt);
		//count=count+1;
		e.displayDetails();
		
		e = new EmployeeDetail("teena", "bodhwani", 30000, "b", dt);
		//count=count+1;
		e.displayDetails();
		
		e = new EmployeeDetail("teena", "bodhwani", 30000, "b", dt);
		//count=count+1;
		e.displayDetails();
		
		//c.getInvoices();
		
	}
}