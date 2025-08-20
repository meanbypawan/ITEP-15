class Employee{
    private int id;
    private String name;
    private String contact;
    public Employee(int id, String name, String contact){
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
    public String toString(){
        return id+" "+name;
    }
}
class TestMain{
    public static void main(String args[]){
        Employee e1 = new Employee(100, "Atul","9009111222");
        //System.out.println(e1.getId()+"  "+e1.getName()+" "+e1.getContact()); 
        System.out.println(e1);
    }
}