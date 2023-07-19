package multithreadscode;

class Warrior1 extends Thread{
	String res1="Brhmasastra";
	String res2="Sarpasutra";
	String res3="pashupatashtra";
	public void run() {
		if(Thread.currentThread().getName().equals("Arjuna")) {
			ArjunaAcq();
		}
		else {
			KarnaAcq();
		}
		
	}
	void KarnaAcq() {
		// TODO Auto-generated method stub
		 try {
			 synchronized(res1){
				 System.out.println("karna Acquired "+res1);
				 Thread.sleep(3000);
			 }
			 
			synchronized(res2){
					 System.out.println("karna Acquired "+res2);
					 Thread.sleep(3000);
			}
				 
			synchronized(res3){
						 System.out.println("karna Acquired "+res3);
						 Thread.sleep(3000);
				 }
			
			 
			 
		 
		 }
		 
		catch(Exception e) {
			 e.printStackTrace();
		 }
		
	}
	void ArjunaAcq() {
		// TODO Auto-generated method stub
		 try {
			 synchronized(res1){
				 System.out.println("Arjuna Acquired "+res1);
				 Thread.sleep(3000);
			 }
			synchronized(res2){
					 System.out.println("Arjuna Acquired "+res2);
					 Thread.sleep(3000);
				 }
		 synchronized(res3){
						 System.out.println("Arjuna Acquired "+res3);
						 Thread.sleep(3000);
				 }
		 }
			 
		 
		 
		 
		catch(Exception e) {
			 e.printStackTrace();
		 }
		
	}
}

public class Code10 {
	public static void main(String[] args) {
		Warrior1 w1=new Warrior1();
		Warrior1 w2=new Warrior1();
		w1.setName("Karna");
		w2.setName("Arjuna");
		w1.start();
		w2.start();
	}
}


