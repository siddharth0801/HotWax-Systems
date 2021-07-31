
public class Account {

	String name;
	private long balance=1000;
	
	Account(String name,long am){
		this.balance=am;
		this.name=name;
	}
	public Account() {
		this("sid",1000);
	}
	public long getB() {
		return balance;
	}
	public void withdraw(long am) {
		balance-=am;
	}
	
}
