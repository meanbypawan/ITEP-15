import java.util.TreeSet;
class TestMain{
    public static void main(String args[]){
        TreeSet<Employee> ts = new TreeSet<Employee>();
        //TreeSet<Employee> ts = new TreeSet<Employee>(new SortBySalary());
        //TreeSet<Employee> ts = new TreeSet<Employee>(new SortByName());
        Employee e1 = new Employee(1,"A",89000);
        Employee e2 = new Employee(2,"C",99000);
        Employee e3 = new Employee(4,"D",103000);
        Employee e4 = new Employee(6,"B",150000);
        Employee e5 = new Employee(5,"E",76000);
        Employee e6 = new Employee(5,"F",76000);
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        ts.add(e6);
        for(Employee e : ts)
          System.out.println(e);
    }
}