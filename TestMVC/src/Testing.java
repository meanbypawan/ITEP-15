import java.util.ArrayList;
import java.util.Scanner;

import dao.EmployeeDAO;
import model.Employee;

public class Testing {
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Press 1 for insert");
	  System.out.println("Press 2 for view all");
	  int choice = sc.nextInt();
	  if(choice == 1) {
		  System.out.println("Enter employee name");
		  String name = sc.next();
	      System.out.println("Enter skill");
		  String skill = sc.next();
	      System.out.println("Enter salary");
	      int salary = sc.nextInt();
	      Employee e = new Employee(name, salary, skill);
	      boolean status = EmployeeDAO.save(e);
	      if(status)
	    	  System.out.println("Employee save");
	      else
	    	  System.out.println("Not saved..");
	  }
	  else if(choice == 2) {
		  ArrayList<Employee> al =  EmployeeDAO.fetchAll();
		  for(Employee e : al)
			  System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getSkill());
	  }
	  else
		  System.out.println("Invalid choice");
  }
}
