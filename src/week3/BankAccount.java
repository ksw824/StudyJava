package week3;

public class BankAccount {
	public String name;
	public int balance = 0;
	
	public void writeInfo() {
		System.out.print("예금주: "+name);
		System.out.println(", 잔액: " + balance);
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	public void withdraw(int amount) {
		balance -= amount;
	}
}
