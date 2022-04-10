package lang;

public class ThisEx {
	
	int id;
	
	ThisEx(int id1)
	{
		id=id1;
	}

	public static void main(String[] args) {
		
		ThisEx tex=new ThisEx(10);
		System.out.println(tex.id);

	}

}
