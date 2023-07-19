package multithreadscode;
class MSOffice extends Thread{
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
		for(int i=0;i<5;i++) {
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
		for(int i=0;i<5;i++) {
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
		for(int i=0;i<5;i++) {
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

public class Code6 {
	public static void main(String[] args) {
		
	
	MSOffice ms1=new MSOffice();
	MSOffice ms2=new MSOffice();
	MSOffice ms3=new MSOffice();
	ms1.setName("saving");
	ms2.setName("typing");
	ms3.setName("checking");
	ms1.start();
	ms2.start();
	ms3.start();
	
}

}
