class Employee{
   private int id;
   private String name;
   private static int counter=0;
   public Employee(int id, String name){
    this.id = id;
    this.name = name;
    counter++;
   }
   public Employee(){
    counter++;
   }
   public static void displayCount(){
       System.out.println("Total Object Created : "+counter);
   }
}

class TestMain{
    public static void main(String args[]){
        Employee e1 = new Employee(100,"Atul"); // e1 {id:100,name:"Atul"}
        Employee e2 = new Employee(101,"Chinku"); // e2 {id:101,name:"Chinku"}
        Employee e3 = new Employee();
        Employee.displayCount();
    }
}