package Bank;

public class BankAccount {

	
		// TODO Auto-generated method stub
		private int AccountNumber;
		private String AccountHolder;
		private double balance;
		
		BankAccount()
		{
			
		}
		
		BankAccount(int AccountNumber,String AccountHolder,double balance)
		{
			this.AccountNumber=AccountNumber;
			this.AccountHolder=AccountHolder;
			this.balance=balance;
		}
		
		void deposite(double amount) {
			try 
			{
			if(amount<=0) {
				throw new IllegalArgumentException();
			}else {
				balance+=amount;
				//System.out.println("Balance :"+balance);
			}
			
			}catch(IllegalArgumentException e) {
				System.out.println("Invalid deposit amount");
			}
			
		}
		
		void withdraw(double amount) {
			try {
			if(amount<=0) 
			{
				throw new IllegalArgumentException();
			}
			
			else if(amount>balance)
			{
				throw new ArithmeticException();
			}
			
			}catch(IllegalArgumentException e) {
				System.out.println("Invalid withdraw amount");
			}
			catch(ArithmeticException e) {
				System.out.println("Insufficient Balance");
			}
		}
		public void display()
		{
			System.out.println("Account Number :"+AccountNumber);
			System.out.println("Account Holderr:"+AccountHolder);
			System.out.println("Balance :"+balance);
			
		}
		public static void main(String[]args) {
			BankAccount a= new BankAccount(101,"NANO",50000);
			a.deposite(10000);
			a.withdraw(20000);
			a.deposite(10000);
			a.withdraw(200000);
			a.display();
			
		}

	}


