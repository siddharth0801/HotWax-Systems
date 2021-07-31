
public class AccountOverdrawSafeDemo implements Runnable {

	private Account a = new Account();
	
	public static void main(String[] args) {
		 AccountOverdrawSafeDemo th = new  AccountOverdrawSafeDemo();
		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		t1.setName("Siddharth thread");
		t2.setName("Shailendra thread");
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			makewithdraw(200);
			if(a.getB()<0) {
				System.out.println("Overdraw!!");
			}
		}
		System.out.println("After "+Thread.currentThread().getName()+" Completes the Transaction, Balance is "+a.getB());
	}
	/* synchronized keyword makes it Thread Safe which means,
	 * when one Thread is in this method other Thread,
	 *  waits till it leaves the method.*/
	private synchronized void makewithdraw(long i) {
		if(a.getB()>=i) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			try {
				System.out.println(Thread.currentThread().getName() + " is processing the transaction");
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " transaction processed.");

			a.withdraw(i);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal, Balance is "+a.getB());

		}
		else {
			System.out.println("Insuffiecient Balance!! for "+Thread.currentThread().getName());
		}
		
	}

}
