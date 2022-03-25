package Package2;
import Package1.Class_1;
public class Class_4 {
	
	Class_4()
	{
		
		
	System.out.println("Other package  Constructor");
	
	Class_1 c1=new Class_1();
    //System.out.println("Private Var   :"+privateVar);
    //System.out.println("Default Var   :"+defaultVar);
    //System.out.println("Protected Var :"+protectedVar);
    System.out.println("Public Var    :"+c1.publicVar);
	}

}
