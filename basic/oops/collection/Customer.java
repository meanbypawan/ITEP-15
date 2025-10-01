class Customer{
    private int id;
    private String name;
    private int balance;
    public Customer(int id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int hashCode(){
        return id;
    }
    public boolean equals(Object o){
        Customer c = (Customer)o;
        return (this.id == c.id) && (this.name.equals(c.name));
    }
    public Customer(){}
    public String toString(){
        return id+" "+name+" "+balance;
    }
}