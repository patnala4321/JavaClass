package lang;

abstract class Test {
	void show() {
		System.out.println("Show in Abstract");
	}
	
	abstract void absMethod();
}

public class AbstractEx extends Test{

	void absMethod()
	{
		System.out.println("Abstract Method Definition");
	}
	void show() {
	          super.show();
				System.out.println("Show in current class");
	}

	void display()
	{
		super.show();
		System.out.println("Display in AbstractEx");
	}
	public static void main(String[] args) {

		AbstractEx abex = new AbstractEx();
		abex.show();
		
		//Test t=new Test();
		
		abex.display();

		

	}

}
