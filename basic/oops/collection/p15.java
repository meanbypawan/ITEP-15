import java.util.LinkedHashSet;
class TestMain{
    public static void main(String args[]){
      LinkedHashSet<Customer> lhs = new LinkedHashSet<Customer>();
      lhs.add(new Customer(100,"A",90000));
      lhs.add(new Customer(101,"B",94000));
      lhs.add(new Customer(102,"C",89000));
      lhs.add(new Customer(103,"D",99000));
      lhs.add(new Customer(104,"E",75000));
      lhs.add(new Customer(100,"X",95000));

      for(Customer c : lhs)
        System.out.println(c +" : "+c.hashCode());
    }
}