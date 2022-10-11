package t6_crudOper;
import java.util.*;
import java.util.Scanner;

public class Employee {
	private int EmpID;
	private String EmpName;
	private int Salary;
	private long MobileNum;
	
	//constructor
	public Employee(int EmpID,String EmpName,int Salary, long MobileNum) {
		this.EmpID=EmpID;
		this.EmpName=EmpName;
		this.Salary=Salary;
		this.MobileNum=MobileNum;
	}
	
	//get method
	public int getEmpID() {
		return EmpID;
	}
	
	public String getEmpName(){
		return EmpName;
	}
	
	public int getSalary() {
		return Salary;
	}
	
	public long getMobileNum() {
		return MobileNum;
	}
	
	public String toString() {
		return EmpID+" "+EmpName+" "+Salary+" "+MobileNum;
	}

}

class Main{
	public static void main(String []args) {
		
		//collection in array list
		List<Employee> col=new ArrayList<Employee>();
		
		Scanner s=new Scanner(System.in); //to get integer value
//		Scanner s1=new Scanner(System.in); //to get string value
		int temp;
		
		do {
			System.out.println("1. CREATE(Insert)");
			System.out.println("2. READ(Display) ");
			System.out.println("3. UPDATE ");
			System.out.println("4. DELETE ");
			System.out.println("5. EXIT ");
			
			System.out.print("Enter Your Choice : ");
			temp=s.nextInt();
			
			switch(temp) {
			case 1: //insertion
				System.out.print("Enter the EmpID: ");
				int empid=s.nextInt();
				System.out.print("Enter the EmpName: ");
				String empname=s.next();
				System.out.print("Enter the Salary: ");
				int salary=s.nextInt();
				System.out.print("Enter the Mobile Number: ");
				long MobileNum=s.nextLong();
				
				col.add(new Employee(empid,empname,salary,MobileNum));
				System.out.println("\n----------------------");
			
				System.out.println("\n Record Inserted..! \n");
				
				System.out.println("----------------------\n");
			break;
			
			case 2: //display the record
				System.out.println("\n****************************");
				//display record line by line
				Iterator<Employee> i=col.iterator();
				
				while(i.hasNext()) { //retrieve one by one record if end then it exit false
					Employee e=i.next();
					System.out.println(e);
				}
				System.out.println("****************************\n");
			break;
			
			case 3:
				boolean found=false;
				System.out.print("Enter EmpID to Update: ");
				empid =s.nextInt();
				
				System.out.println("----------------------");
				ListIterator<Employee>li=col.listIterator();
				while(li.hasNext()){
					Employee e=li.next();
					
					if(e.getEmpID() == empid) {
						System.out.println("Enter New EmpName: ");
						empname=s.next();
						
						System.out.println("Enter New Salary: ");
						salary=s.nextInt();
						
						System.out.println("Enter the Mobile Number: ");
						MobileNum=s.nextLong();
						
						//to change the data
						li.set(new Employee(empid,empname,salary,MobileNum));
						found=true;
					}
				}
				System.out.println("----------------------");
				if(!found) {
					System.out.println("Data Not Found");
				}else {
					System.out.println("\n Record Updated..! \n");
				}
				System.out.println("----------------------");
			break;
			
			
			case 4:
				found=false;
				System.out.print("Enter EmpID to Delete: ");
				empid =s.nextInt();
				System.out.println("----------------------");
				i=col.iterator();
				while(i.hasNext()){
					Employee e=i.next();
					
					if(e.getEmpID()==empid) {
						//to change the data
						i.remove();
						found=true;
					}
				}
				 
				if(!found) {
					System.out.println("Data Not Found");
				}else {
					System.out.println("\n Record Deleted..! \n");
				}
				System.out.println("----------------------");
			break;
			
			
			case 5:
				System.exit(0);
			break;
			
			default:
				System.out.println("INVALID INPUT");
			break;
			
			
		
		}
			
		}while(temp!=0);
		
		 //scanner close
		s.close();
//		s1.close();
		
	}
}
