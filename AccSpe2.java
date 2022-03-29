package Package1;

public class AccSpe2 extends AcceSpe {
	
	
	void show()
	{
		  // System.out.println("Private Var   :"+privateVar);
		    System.out.println("Default Var   :"+defaultVar);
		    System.out.println("Protected Var :"+protectedVar);
		    System.out.println("Public Var    :"+publicVar);
		
	}
	

	public static void main(String[] args) {
		AccSpe2 ac1=new AccSpe2();
		ac1.show();

	}

}
