package ExceptionHandling;

public class ExceptionPropagation {
	void m() {
		int data = 50 / 0;
		
		System.out.println("Method M");
	}

	void n() {
	//	try {
		m();
	//	}
//		 catch (Exception e) {
//			System.out.println("exception handled");
//		}
		
		System.out.println("Method n");
		
	}

	void p() {
		try {
			n();
      } catch (Exception e) {
	System.out.println("exception handled");
   		}
			
			System.out.println("Method P");
	}

	public static void main(String args[]) {
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.p();
		System.out.println("normal flow...");
	}

}