package com.javacoding;

public class JavaCoding {
	
//a=10, b= 20 Swap the value a=20, b=10
	
	static int a = 10;
	static int b = 20;
	
	public static void main(String[] args) {
		
		System.out.println("A value before swap ="+a);
		System.out.println("B value before swap ="+b);

		a=a+b;//a=10+20 = 30
		b=a-b;//b=30-20 =10
		a=a-b;//a=30-10 =20
		
		
		System.out.println("A value after swap ="+a);
		System.out.println("B value after swap ="+b);

		
		
	}
			
	
	

}
