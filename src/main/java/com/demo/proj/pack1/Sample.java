package com.demo.proj.pack1;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Hello");
		String a = "Hello";
		String b = "Developers2";
		MyFuntionalI obj = (a1, b1) -> {
			
			return a1+ b1;
			
			} ;
		System.out.println(obj.print(a,b));
	}
	
	public static String getMsg()
	{
		return "Java";
	}
}

@FunctionalInterface
interface MyFuntionalI
{
	public String print(String s1, String s2);
}
