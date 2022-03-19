package automation_selenium;

public class Java_class {

	void mayeedul() {
		int k = 25;
		int l = 15;
		System.out.println(k-l);
	
		
	}
	void mayeedul_1() {
		int a =100;
		int b = 2;
		System.out.println(a*b);
		
		
	}
	
	public static void instancevariable() {
		String name;
		name = "Mayeedul";
		
		int age;
		age =40;
		
		double salary;
		salary = 80.50;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		
	}
	
	public static void instancevariable_1() {
		int a;
		a = 5;
		int b;
		b = 10;
		
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a-b);
		
	}
	
	
	public static void main(String[] args) {
		Java_class obj = new Java_class();
		
		obj.instancevariable();
		obj.mayeedul();
		obj.mayeedul_1();
		obj.instancevariable_1();
		
		
		
		System.out.println();
		
		
		
				

	}

}




