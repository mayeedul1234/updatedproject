package MethodOverloadingHomeWork;

public class JavaMethodOverloading1 {
	
	void getmoney(int a, int b) {
		System.out.println(a+b);
		
	}
	void getmoney(double x, double y) {
		System.out.println(x+y);
		
		
	}
	void getmoney(int c, int d, int y) {
		System.out.println(c+d+y);

	
}
	void getmoney(double c, double d, double e) {
		System.out.println(c/d/e);
	
	
}
	public static void main(String[] args) {
		JavaMethodOverloading1 obj = new JavaMethodOverloading1();
		obj.getmoney(100,200);
		obj.getmoney(100.36, 50.64);
		obj.getmoney(100, 50, 200);
		obj.getmoney(10.10, 10.20, 10.30);
		
	}

}