package multithreadscode;

import java.util.Scanner;

class Operations extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("banking")) {
			banking();
		}
		else if(Thread.currentThread().getName().equals("printing")) {
			printing();
		}
		else {
			add();
		}
	}
	void banking() {
		Scanner sc=new Scanner (System.in);
		System.out.println("banking operation");
		System.out.println("enter the acc no");
		int acc=sc.nextInt();
		System.out.println("enter the pin");
		int pin=sc.nextInt();
		System.out.println("banking completed");
	}
	void add() {
		Scanner sc=new Scanner (System.in);
		System.out.println("addition operation");
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("ENTER num2");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println(res);
	}
	void printing() {
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


public class Code2 {
	public static void main(String[] args) {
		System.out.println("main started");
		Operations op1=new Operations();
		op1.setName("banking");
		Operations op2=new Operations();
		op2.setName("printing");
		Operations op3=new Operations();
		op3.setName("add");
		
		op1.start();
		op2.start();
		op3.start();
		System.out.println("main ended");
			
	}

}
