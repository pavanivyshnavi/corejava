package javaprograms;

public class Bank {
	static int currentbalance=2000;
	

	public static void main(String[] args) {
		System.out.println("currentbalance:"+currentbalance);
		greetings();
		Bank bank=new Bank();
		bank.deposit(1000);
		bank.withdrawl(1500);
		System.out.println("currentbalance:"+bank.getcurrentbal());
		}
	public static void greetings() {
		System.out.println("Hello,welcome to banking application ");
	}
   public void deposit(int amount) {
	   currentbalance=currentbalance+amount;
	   System.out.println("currentbal after deposit:"+currentbalance);
   }
   public void withdrawl(int amount) {
	   currentbalance=currentbalance-amount;
	   System.out.println("currentbal after withdrawl:"+currentbalance);
   }
   public int getcurrentbal() {
	  return currentbalance;
}
}