package BankSystem;
public class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    // Creating a constructor
    BankAccount(int accountNumber,String accountHolderName,double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance=balance;
    }
    public double deposit(double amount){
        if (0<amount){
            balance = balance + amount;
            System.out.println("Updted Balance is :- "+ balance);
        }
        else{
            System.out.println("No negative or Zero amount we be valid");
        }
        return balance;
    }
    public double  withdraw(double amount){
        if (balance<amount){
            System.out.println("Your balance is insufficent");
        }
        else{
            if(amount>0){
                balance = balance-amount;
            }
            else if(amount<0){
                System.out.println("Pleses recheck your amount must be greater thn zero");
            }
        }
        return balance;
    }
    public double getBalance(){
        System.err.println("Your current balane is " + balance);
        return balance;
    }
    public int getAccountNumber(){
        System.out.println("Here is your ccount Number :-"+ accountNumber);
        return accountNumber;
    }
    public String getAccountname(){
        System.out.println("Hee is your ccount Number :-"+ accountHolderName);
        return accountHolderName;
    }
    public void displayAccountDetails(){
        getBalance();
        getAccountNumber();
        getAccountname();
    }
}