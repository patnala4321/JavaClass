package Package1;


interface Inferface1 {

	void showInterface1();
	void show();
}

interface Interface2 {

	void showInterface2();
	void show();
}

abstract class AbstractClass{
	abstract void showInterface3();
	void show()
	{
	System.out.println("Show method in Abstract Class");	
	}
}



public class MultipleInheritanceEx extends AbstractClass implements Interface2,Inferface1{

	public void showInterface1()
	{
		System.out.println("SowInterface1 Method");
	}

	public void showInterface2()
	{
		System.out.println("SowInterface2 Method");
	}
	
	public void showInterface3()
	{
		System.out.println("SowInterface3 Method");
	}
	
	public void show()
	{
		System.out.println("Show Method in Main Class");
	}

 
	
	
	public static void main(String[] args) {
		
		Inferface1 int1;
		
		
		Interface2 int2;
		
		AbstractClass abs;
		
		
		
		int1=new MultipleInheritanceEx();
		
		int2= new MultipleInheritanceEx();
		
		abs=new MultipleInheritanceEx();
		
		int1.showInterface1();
		int1.show();
		
		int2.showInterface2();
		int2.show();
		
		
		abs.showInterface3();
		abs.show();
		
		MultipleInheritanceEx mix=new MultipleInheritanceEx();
		
		abs=(AbstractClass)new MultipleInheritanceEx();
		
		//mix=(MultipleInheritanceEx) abs;
		
		new MultipleInheritanceEx().show();
		
		
		
//		new AbstractClass().show();
//		abs.show();
		
		
	}
}
