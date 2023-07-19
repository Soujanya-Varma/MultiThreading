package multithreadscode;

class MSOffice1 extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("checking")) {
			checking();
		}
		else {
			saving();
		}
	}
	void saving() {
		for(;;) {
			System.out.println("saving");
		
			try {
			
			Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
}
	void typing() {
		for(;;) {
			System.out.println("typing");
		
			try {
			
			Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
	}
	void checking() {
		for(;;) {
			System.out.println("checking");
		
			try {
			
			Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		
	}
		
	}
}

public class Code7 {
	public static void main(String[] args) {
		
	
	MSOffice1 ms1=new MSOffice1();
	MSOffice1 ms2=new MSOffice1();
	MSOffice1 ms3=new MSOffice1();
	ms1.setName("saving");
	ms2.setName("typing");
	ms3.setName("checking");
	ms2.setDaemon(true);
	ms3.setDaemon(true);
	ms2.setPriority(8);
	ms3.setPriority(9);
	ms1.start();
	ms2.start();
	ms3.start();
	
}

}



