import java.util.LinkedList;
class TestMain{
    public static void main(String argg[]){
      LinkedList<Integer> ll = new LinkedList<Integer>();
      ll.add(10);
      ll.add(20);
      ll.add(30);
      ll.add(40);
      ll.addFirst(1000);
      ll.addLast(5000);
      System.out.println(ll);
    }
}