/*
  Iterator v/s ListIterator
  
  Iterator :-
   1. iterator() method available in Iteratble interface so it is applicable on
   all child classes of Iterable/Collection [AL,LL,Vec,Stack, HS,LH,TS].
   2. iterator() can only move in forward direction / forward traversing
   3. Iterator itr = collectionObject.iterator();
  
  ListIterator :- listIterator(), listIterator(int) method available in List
  interface so it is applicable on all child classes of List Only.(AL,LL,Vec,Stack)

  2. ListIterator can move in forward as well as backward direction
     Forward Traversing and Backward Traversing
  3. ListIterator lit = listObject.listIterator();
  
  4. ListIterator is a child of Iterator.
 */
import java.util.ListIterator;
import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
       ArrayList<Double> al = new ArrayList<Double>(); 
       al.add(10.5);
       al.add(1.2);
       al.add(3.5);
       al.add(100.4);
       al.add(2.5);
       //ListIterator<Double> lit =  al.listIterator(2);
       ListIterator<Double> lit = al.listIterator(al.size());
       while(lit.hasPrevious()){
          Double element =  lit.previous();
          System.out.println(element);
       }
    }
}






