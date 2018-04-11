/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class EmployeeDetail{

private String fName,lName,grade;
Date doj;
private float salary;
private static int count=0;
private int id;


//default constructor
/*public Employee(String ){
	fName="";
	lNameame="";
	salary=0.00f;
	grade="";
	jMonth="";
}
*/
	
	public EmployeeDetail(String fName, String lName, float salary, String grade, Date doj){
	//	System.out.println("inside parameterized constructor");
		this.fName = fName;
		this.lName = lName;
		this.grade = grade;
		
		this.doj = doj;
		this.salary = salary;
		id = ++count;
		}
	
	public void displayDetails(){
		System.out.print("\n\n\nFirst Name: "+ fName);
		System.out.print("\nLast Name: "+ lName);
		System.out.print("\nSalary: "+ salary);
		System.out.print("\ngrade: "+ grade);
	    System.out.print("\nJoining date: " + doj.getDay() +"/"+ doj.getMonth() +"/"+ doj.getYear());
	//    System.out.print("\n joining month: "+ doj.getMonth());
//	    System.out.print("\n joining month: "+ doj.getYear());
		System.out.print("\nEmp id: "+ count);
	}
}

