import java.util.Scanner;
import java.text.DecimalFormat;
public class Account{
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    Scanner in = new Scanner(System.in);
    DecimalFormat  moneyFormat = new DecimalFormat("'$'###,##0.00");
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;

    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
public double calcCheckingWithdrawal(double amount){
    checkingBalance = (checkingBalance - amount);
    return checkingBalance;
}
public double calcSavingWithdrwal(double amount){
    savingBalance = (savingBalance - amount);
    return savingBalance;
}
public double calcCheckingDeposite(double amount){
    checkingBalance = (checkingBalance + amount);
    return checkingBalance;
}
public double calcSavingDeposite(double amount){
    savingBalance = (savingBalance + amount);
    return savingBalance;
}
public void getCheckingWithdrawInput(){
    System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
    System.out.println("Amount You Want to withdraw from checking Account");
    double amount = in.nextDouble();
    if((checkingBalance-amount) >= 0){
        calcCheckingWithdrawal(amount);
        System.out.println("New Checking Account Balance:" +moneyFormat.format(checkingBalance));
    }
    else{
        System.out.println("Balance Cannot be negative" + "\n");
    }
}
public void getSavingWithdrwalInput(){
    System.out.println("Saving  Account Balance: " + moneyFormat.format(savingBalance));
    System.out.print("How much do you want to Withdraw? ");
    double amount=in.nextDouble();
    if((savingBalance-amount)>=0){
        calcSavingWithdrwal(amount);
        System.out.println("New saving Account Balance is:" + moneyFormat.format(savingBalance));
    }
    else{
        System.out.println("balance Cannot be Negative" + "\n");

    }
}
public void getSavingDepositeInput(){
    System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
    System.out.println("Amount You want to Deposite From checking Account:");
    double amount =  in.nextDouble();
    if((checkingBalance + amount) >= 0){
        calcCheckingDeposite(amount);
        System.out.println("New Savings Account Balance:" + moneyFormat.format(savingBalance));
    }
    else{
        System.out.println("balance cannot be negative");
    }
} 
public void getCheckingDepositeInput(){
    System.out.println("Checking Account Balance:" + moneyFormat.format(checkingBalance));
    System.out.println("Amount You want to Deposite from Checking Account");
    double amount = in.nextDouble();
    if((checkingBalance + amount)>=0){
        calcCheckingDeposite(amount);
        System.out.println("New Checking Account Balance:" + moneyFormat.format(checkingBalance));
    }
    else{
        System.out.println("Amount Cannot be nagative");
    }
}

}
        
    

