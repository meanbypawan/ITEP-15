import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient Balance");
    }
}
class LowBalanceException extends Exception{
    public LowBalanceException(){
        super("Account running below minimum balance(10000)");
    }
} 
class ICICI{
    private int bal;
    public ICICI(){
        bal = 10000;
    }
    public void deposite(int amount){
        bal += amount;
    }
    public void withdrawal(int amount){
       try{
        if(amount > bal)
          throw new InsufficientBalanceException();
        else{
            bal = bal - amount;
            System.out.println("Witdrawal Success...");
            if(bal < 10000)
             throw new LowBalanceException();
        }  
       }
       catch(InsufficientBalanceException e){
        e.printStackTrace();
       }
       catch(LowBalanceException e){
        e.printStackTrace();
       }
    }
    public int getBal(){
        return bal;
    }
}
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ICICI obj1 = new ICICI();
        obj1.deposite(50000);
        System.out.println("Available Balance : "+obj1.getBal());
        
        for(int i=1; i<=3; i++){
            System.out.println("Enter amount");
            int amount = sc.nextInt();
            obj1.withdrawal(amount);
            System.out.println("Avaialble Balance : "+obj1.getBal());
            System.out.println("------------------------------------------");
        }
    }
}