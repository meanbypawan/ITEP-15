import java.util.ArrayList;
import java.util.Collections;
class TestMain{
    public static void main(String args[]){
        ArrayList<Customer> al = new ArrayList<Customer>();
        al.add(new Customer(100,"A",60000));
        al.add(new Customer(103,"C",70000));
        al.add(new Customer(104,"D",90000));
        al.add(new Customer(102,"B",80000));
        al.add(new Customer(105,"E",40000));

        Collections.sort(al);
        for(Customer c : al)
          System.out.println(c);
    }
}