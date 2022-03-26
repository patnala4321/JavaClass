package Package1;

interface Bank {
	void rateOfInterrest(); // public abstract void rateOfInterrest();
}

class SBI implements Bank {
	public void rateOfInterrest() {
		System.out.println("8%");
	}
}

class ICICI implements Bank {
	public void rateOfInterrest() {
		System.out.println("8.5%");
	}
}

class HDFC implements Bank {
	public void rateOfInterrest() {
		System.out.println("7.5%");
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) {

		Bank bank;

		bank = new SBI();

		bank.rateOfInterrest();

		bank = new SBI();

		bank.rateOfInterrest();

		bank = new HDFC();

		bank.rateOfInterrest();

	}

}
