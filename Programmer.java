package Package1;

class Employee {
	float salary = 40000;
	float hra=5000;
}

class Programmer extends Employee {
	int bonus = 10000;
    float hra=8000;

	public static void main(String args[]) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
		System.out.println("Hra of Programmer   is  :"+p.hra);
	}
}
