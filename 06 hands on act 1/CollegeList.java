import java.util.Scanner;


public class CollegeList
{
	public static void main(String[] args) {
	    
	    Scanner bdlp = new Scanner(System.in);
		System.out.print("Press E for Employee, F for Faculty, or S for Student: " );
		char option = bdlp.next().charAt(0);
		bdlp.nextLine();
		option = Character.toUpperCase(option);
		switch (option) {
		    case 'E':
		        Employee emp = new Employee();
		        System.out.println("Type employee's name, contact number, salary, and department.");
		        System.out.println("Press Enter after every input. ");
		    
		        System.out.print("Name: ");
		        emp.setName(bdlp.nextLine());
		    
		        System.out.print("Contact Number: ");
		        emp.setContactNum(bdlp.nextLine());
		    
		        System.out.print("Salary: ");
		        emp.setSalary(Double.parseDouble(bdlp.nextLine()));
		    
		        System.out.print("Department: ");
		        emp.setDepartment(bdlp.nextLine());
		    
		        displayEmployee(emp);
		        break;
		    
		    case 'F':
		        Faculty fac = new Faculty();
		        System.out.println("Type employee's name, contact number, salary, department, and regular Status.");
		        System.out.println("Press Enter after every input. ");
		    
		        System.out.print("Name: ");
		        fac.setName(bdlp.nextLine());
		    
		        System.out.print("Contact Number: ");
		        fac.setContactNum(bdlp.nextLine());
		    
		        System.out.print("Salary: ");
		        fac.setSalary(Double.parseDouble(bdlp.nextLine()));
		    
		        System.out.print("Department: ");
		        fac.setDepartment(bdlp.nextLine());
		        
		        System.out.print("Is Faculty regular (true/false): ");
		        fac.setStatus(Boolean.parseBoolean(bdlp.nextLine()));
		    
		        displayFaculty(fac);
		        break;
		        
		  case 'S':
		        Student stud = new Student();
		        System.out.println("Type employee's name, contact number, salary, department, and regular Status.");
		        System.out.println("Press Enter after every input. ");
		    
		        System.out.print("Name: ");
		        stud.setName(bdlp.nextLine());
		    
		        System.out.print("Contact Number: ");
		        stud.setContactNum(bdlp.nextLine());
		        
		        System.out.print("Program: ");
		        stud.setProgram(bdlp.nextLine());
		        System.out.println("Input any single digit");
		        System.out.print("Year Level: ");
		        stud.setYearLevel(Integer.parseInt(bdlp.nextLine()));
		    
		        displayStudent(stud);
		        break;
		  default:
		  System.out.println("Invalid Option");
		      
		        
		}

	}
	
	public static void displayEmployee(Employee emp) {
	    System.out.println("\n--------------------------");
	    System.out.println("Name: " + emp.getName());
	    System.out.println("Contact Number: " + emp.getContactNum());
	    System.out.println("Salary: " + emp.getSalary());
	    System.out.println("Department: " + emp.getDepartment());
	    System.out.println("--------------------");
	    
	    

	}
	
	public static void displayFaculty(Faculty fac) {
	    System.out.println("\n--------------------------");
	    System.out.println("Name: " + fac.getName());
	    System.out.println("Contact Number: " + fac.getContactNum());
	    System.out.println("Salary: " + fac.getSalary());
	    System.out.println("Department: " + fac.getDepartment());
	    System.out.println("Status: " + (fac.isRegular() ? "Yes" : "No"));
	    System.out.println("--------------------");
	}
	
	public static void displayStudent(Student stud) {
	    System.out.println("\n--------------------------");
	    System.out.println("Name: " + stud.getName());
	    System.out.println("Contact Number: " + stud.getContactNum());
	    System.out.println("Program: " + stud.getProgram());
	    System.out.println("Year Level: " + stud.getYearLevel());
	    System.out.println("--------------------");
	}
	
	
	
}













