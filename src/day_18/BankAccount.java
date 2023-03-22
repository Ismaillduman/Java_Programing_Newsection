package day_18;

public class BankAccount {
    /*Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
				1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	5. withdraw(amount): decreases the balance by the specified amount*/

    public String accountHolder;
    public int accountNumber;
    public double balance;
    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void checkBalance(){

        System.out.println("Your current balance= $"+balance);
    }

public void deposit(double amount){
        if(amount<1){
            System.out.println("Insufficient deposit amount: "+amount);
        }
    System.out.println("deposit to "+accountHolder+ " $"+amount);
        balance+=amount;
}
public void withDraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient withdraw amount: "+amount);
        }
    System.out.println("from "+accountHolder+ " withdrawn $"+amount);
        balance-=amount;
}
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", Balance= $" + balance+
                '}';
    }
}
