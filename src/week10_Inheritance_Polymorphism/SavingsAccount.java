package week10_Inheritance_Polymorphism;

public class SavingsAccount extends BankAccount{
	private double intRate;
	
	public SavingsAccount(String name, int balance, double intRate) {
		super(name, balance);
		this.intRate = intRate;
		// TODO Auto-generated constructor stub
	}
	public void setIntRate(double newRate) {
		this.intRate = newRate;
	}
	public double getIntRate() {
		return this.intRate;
	}
	public void writeInfo() {
		super.writeInfo();
		System.out.printf("이율: %.2f%%\n", intRate);
	}
}
