/*
Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.
*/
import java.util.ArrayList;
class Bank{
    private ArrayList<Account> al = new ArrayList<Account>();
    
    public void addAccount(Account account){
       al.add(account);
    }
    public void removeAccount(Account account){
        al.remove(account);
    }
    public void displayAccountDetails(){
        for(Account account : al){
            System.out.println(account.getFullAccountDetails());
        }
    }
}
class Account{
    private String holderName;
    private String contact;
    private int balance;
    public Account(String holderName,String contact, int balance){
        this.holderName = holderName;
        this.contact = contact;
        this.balance = balance;
    }
    public Account(){}
    public String getFullAccountDetails(){
        return holderName+" : "+contact+" : "+balance;
    }
}
class TestMain{
    public static void main(String args[]){
        Account obj1 = new Account("Cheeku","9009111222",50000);
        Account obj2 = new Account("Peeku","9009111333",100000);
        Account obj3 = new Account("Rinku","90091114444",70000);

        Bank icici = new Bank(); // icici
        icici.addAccount(obj1);
        icici.addAccount(obj2);
        icici.addAccount(obj3);
        
        icici.displayAccountDetails();
        icici.removeAccount(obj1);
        System.out.println("-------------------------------------");
        icici.displayAccountDetails();
    }
}