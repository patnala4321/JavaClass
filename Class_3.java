package Package2;
import Package1.Class_1;

public class Class_3 extends Class_1{
	
	
	Class_3()
	{
	System.out.println("Derived other package  Constructor");
    //System.out.println("Private Var   :"+privateVar);
    //System.out.println("Default Var   :"+defaultVar);
    System.out.println("Protected Var :"+protectedVar);
    System.out.println("Public Var    :"+publicVar);
	}
}
