//Company.java(Executable Class)

class Company 
{
	public static void main(String[] args) 
	{
		 //creating 1st instance
		 Employee e1=new Employee();//Here it is only instance
		 e1.eno=101;//Storing Shubhams values in e1 instance
		 e1.ename="shubham";
		 e1.salary=100000;
		 e1.department="Java Developer";//Here onwards e1 instance is called object

		 //creating 2nd instance
		 Employee e2=new Employee();
		 e2.eno=102;
		 e2.ename="Prabhas";
		 e2.salary=40000;
		 e2.department="Acting";

		 //Displaying e1 and e2 object values

		 System.out.println("e1's pointing object values");
		 System.out.println("Employee No::"+e1.eno);
		 System.out.println("Employee Name::"+e1.ename);
		 System.out.println("Employee Salary::"+e1.salary);
		 System.out.println("Employee Dept::"+e1.department);
		 System.out.println();
		 System.out.println("e2's pointing object values");
		 System.out.println("Employee No::"+e2.eno);
		 System.out.println("Employee Name::"+e2.ename);
		 System.out.println("Employee Salary::"+e2.salary);
		 System.out.println("Employee Dept::"+e2.department);


	}
}
