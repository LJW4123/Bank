package bank;

public class BankAccount {	
	private int accountNumber; 
	private String customerName;
	private double accountBalance;
	private static int count = 0;
	
	
	{
	this.accountNumber = ++count;
	}

	public void deposit(double amount) {
		this.accountBalance += amount;
	}
	
	public void withdraw(double amount) {
		if (this.accountBalance >= amount) {
			this.accountBalance -= amount;
		} else
			System.out.println("출금 잔액 부족");
	}
	
	public void transfer(BankAccount account, double amount) {
		if(this.accountBalance >= amount) {
		 this.withdraw(amount);
		 account.deposit(amount);
		}else {
			System.out.println("이체 잔액 부족");
		}
	}

	private BankAccount( String customerName, double accountBalance) {
		
		
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}

	public BankAccount( String customerName) {
		this(customerName,0);

	}

	@Override
	public String toString() {
		String str = "계좌번호 : "+this.accountNumber+"\n";
		str += "고객이름 : "+this.customerName + "\n";
		str += "잔액 : "+this.accountBalance+"\n";
		return str;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public static int getCount() {
		return count;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public static BankAccount getInstance(String name, double amount) {
		BankAccount account = new BankAccount(name,amount);
		//return new BankAccount(name,amount);
		return account;
	}
	
}
