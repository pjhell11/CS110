package chap10;

public class ATM {
	
	public double[] accounts = new double[9];
	
	public void setAccount() {
		for (int i = 0; i < this.accounts.length; i++) {
				accounts[i] = 100;
		}
	}
	
	public void withdraw(int id, double amount) {
		this.accounts[id] = (this.accounts[id] - amount);
	}
	
	public void deposit(int id, double amount) {
		this.accounts[id] = (this.accounts[id] + amount);
	}
	
	public double checkBalance(int id) {
		return this.accounts[id];
	}
}
