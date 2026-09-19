package BankSystem;

public class Main {
        public static void main(String[] args){
            BankAccount acc = new BankAccount(4355432,"Luffy" ,1000);
            acc.getAccountname();
            acc.deposit(450);
            acc.withdraw(584);
            acc.getAccountNumber();
            acc.getBalance();
            acc.displayAccountDetails();
    }
}
