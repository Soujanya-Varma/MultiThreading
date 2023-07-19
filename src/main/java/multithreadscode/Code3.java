package multithreadscode;

import java.util.Scanner;

class banking extends Thread{
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
class printing extends Thread{
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
class addition extends Thread{
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

public class Code3 {
	public static void main(String[] args) {
		System.out.println("main started");
		banking b=new banking();
		b.start();
		
		printing p=new printing();
		p.start();
		addition a=new addition();
		a.start();
		System.out.println("ended");
	}

}
