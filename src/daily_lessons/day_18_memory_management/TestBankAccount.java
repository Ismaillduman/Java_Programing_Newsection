package daily_lessons.day_18_memory_management;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account= new BankAccount();
        account.setInfo("Ismail",12456789);
        account.checkBalance();
        account.deposit(1000);
       account.checkBalance();
       account.withDraw(300);
       account.checkBalance();
        System.out.println(account);
    }
}
