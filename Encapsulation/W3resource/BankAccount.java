package Encapsulation.W3resource;

/*
 * Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
 */
public class BankAccount {
    private int accountNumber;
    private int balance;
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setAccountNumber(10001);
        b.setBalance(100000);
        System.out.println(b.getAccountNumber()+" "+b.getBalance());
    }
    
}
