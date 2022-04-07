package Lang;

public class ToStringEx {
	
	public String toString()
	{
		return "My Message";
	}

	public static void main(String[] args) {
		
		ToStringEx ex=new ToStringEx();
		
		System.out.println(ex);

		System.out.println(ex.hashCode());
	}

}
