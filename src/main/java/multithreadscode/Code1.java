package multithreadscode;

import java.util.Scanner;

public class Code1 {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Banking operation");
		System.out.println("enter the acc no");
		int acc=sc.nextInt();
		System.out.println("enter the pin");
		int pin=sc.nextInt();
		System.out.println("banking completed");
		
		System.out.println("addition operation");
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("ENTER num2");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("result is"+res);
		System.out.println("printing operation");
		for(int i=0;i<5;i++) {
			System.out.println("hi gud mng");
			Thread.sleep(3000);
		}
		
		
	}

}
