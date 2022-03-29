package Package1;

public class AcceSpe {
	
	private   int privateVar;
	          int defaultVar;
	protected int protectedVar;
	public    int publicVar;
	
	
	AcceSpe()
	{
		privateVar=10;
        defaultVar=20;
        protectedVar=30;
        publicVar=40;
		
		
	}
 
	void show()
	{
	    System.out.println("Private Var   :"+privateVar);
	    System.out.println("Default Var   :"+defaultVar);
	    System.out.println("Protected Var :"+protectedVar);
	    System.out.println("Public Var    :"+publicVar);
		
	}
	public static void main(String args[])
	{
		
		AcceSpe ex=new AcceSpe();
		
		ex.show();
		
	}

	

}
