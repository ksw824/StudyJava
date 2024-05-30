package week10_Inheritance_Polymorphism;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bacc = new BankAccount("홍길동",0);
		bacc.writeInfo();
		
		SavingsAccount sacc = new SavingsAccount("임꺽정",1200000,2.5);
		sacc.setIntRate(2.35);
		sacc.deposit(220000);
		sacc.writeInfo();

	}

}
