package atmmeachine;

import java.util.Scanner;

class ATM{
	float Balance;
	int pin=1973;
	public void checkpin() {
		System.out.println("Enter ypur pin:");
		Scanner sc=new Scanner(System.in);
		int enterpin=sc.nextInt();
		if(enterpin==pin) {
			menu();
		}
		else {
			System.out.println("Enter a valid pin");
		}
		
	}
	
	public void menu() {
		System.out.println("Enter your choice:");
		System.out.println("1. check A/c Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");
		
		Scanner sc =new Scanner(System.in);
		int opt=sc.nextInt();
	
		
		if(opt==1) {
			CheckBalance();
			
		}
		else if(opt==2) {
			WithdrawMoney();
			
		}
		else if(opt==3) {
			DepositMoney();
			
		}
		else if(opt==4) {
		return;
		}
		else {
			System.out.println("Enter a valid choice");
		}
		
			
		}
		
	
	
	public void CheckBalance() {
		System.out.println("Balance:" + Balance);
		menu();
	}
	
	public void WithdrawMoney() {
		System.out.println("enter amount to withdraw: ");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
			
		}
		else {
			Balance=Balance-amount;
			System.out.println("Money Withdraw Sucessfully ");
		}
		menu();
	}
	public void DepositMoney() {
		System.out.println("Enter the Amount: ");
		Scanner sc=new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance =Balance + amount;
		System.out.println("Money Deposited Sucessfully");
		menu();
		
	}
	
}









public class ATMmeachine {
	public static void main(String[] args) {
		ATM obj=new ATM();
		obj.checkpin();
		
	}

}
