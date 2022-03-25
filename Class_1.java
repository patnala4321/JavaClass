package Package1;

public class Class_1 {

	private   int privateVar=10;
    int defaultVar=20;
    protected int protectedVar=30;
    public    int publicVar=40;


    public Class_1()
    {
    	System.out.println("Base Class Constructor");
    	
        System.out.println("Private Var   :"+privateVar);
	    System.out.println("Default Var   :"+defaultVar);
	    System.out.println("Protected Var :"+protectedVar);
	    System.out.println("Public Var    :"+publicVar);
	 }

}
