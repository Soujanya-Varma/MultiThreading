package multithreadscode;

import java.util.Scanner;

class Bank implements Runnable{
	public void run() {
		Scanner sc=new Scanner (System.in);
		System.out.println("banking operation");
		System.out.println("enter the acc no");
		int acc=sc.nextInt();
		System.out.println("enter the pin");
		int pin=sc.nextInt();
		System.out.println("banking completed");
	}
}

class Print implements Runnable{
	public void run() {
		System.out.println("printing operation");
		for(int i=0;i<5;i++) {
			try {
			System.out.println("hi gud mng");
			Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
		System.out.println("printing completed");
	}
}

class Add implements Runnable{
	public void run() {
		Scanner sc=new Scanner (System.in);
		System.out.println("addition operation");
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("ENTER num2");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println(res);
	}
}
public class Code13 {
public static void main(String[] args) {
		
		Bank b=new Bank();
		Print p=new Print();
		Add a=new Add();
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(p);
		Thread t3=new Thread(a);
		t1.start();
		t2.start();
		t3.start();
	}

}
