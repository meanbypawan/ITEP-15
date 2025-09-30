class Customer{
    private int id;
    private String name;
    private int balance;
    public Customer(int id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Customer(){}
    public String toString(){
        return id+" "+name+" "+balance;
    }
}