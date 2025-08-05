/*
  Customer :-
    Properites :-  id,name,accountNo,contact,age,balance
    behaviour/functionalities:-  balanceEnquiry(), deposite(), witdrawal()
 */
class Customer{
    private int id;
    private String name;
    private String accountNo;
    private String contact;
    private int age;
    private float balance;

    public void setData(int id, String name, String accountNo, String contact, int age, float balance){
      this.id = id;
      this.name = name;
      this.accountNo = accountNo;
      this.contact = contact;
      this.age = age;
      this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public void balanceEnquiry(){
        System.out.println("Current Balance : "+this.balance);
    }
    public void deposite(float amount){
       this.balance = this.balance + amount;
       System.out.println("Deposite success");
       this.balanceEnquiry();
    }
    public void withdrawal(float amount){
        if(amount > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            this.balance = this.balance - amount;
            System.out.println("Withdrawal Success..");
            this.balanceEnquiry();
        }
    }
}
class TestMain{
    public static void main(String args[]){
        Customer obj = new Customer(); // obj : {id,name,accountNo,contact,age,balance}
        obj.setData(1001,"Cheeku Singh","chk1434344","9009111222",31,200000);
        obj.balanceEnquiry();
        obj.deposite(50000);
        obj.withdrawal(4500);
    
    }
}

