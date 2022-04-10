package lang;

public class WrapperEx {

	public static void main(String[] args) {
		int a=10;
		char c='x';
		
		//Auto Boxing Manually before Java 5
		Integer i=Integer.valueOf(a);
		
		System.out.println(a+   "    "+i);
		
		Character ch=Character.valueOf(c);
		
		System.out.println(c+"     "+ch);
		
		//Unboxing manually before Java
		Integer i1=new Integer(100);
		int i2=i1.intValue();
		System.out.println(i1+"     "+i2);
		
		//Autoboxing automatically from Java 5
		Integer i3=100;     //Integer i23=new Integer(100);
		
		
		int i4=i3;          //int i4=i3.intValue();
		
		System.out.println(i4+"    "+i3);
		
		System.out.println();

	}

	
}
