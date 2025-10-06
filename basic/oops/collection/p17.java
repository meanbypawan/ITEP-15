import java.util.TreeSet;
import java.util.Iterator;
/*
  TreeSet()
  TreeSet(Collection)
  TreeSet(Comparator)
  TreeSet(SortedSet)
 */
class TestMain{
    public static void main(String args[]){
      TreeSet<Integer> ts = new TreeSet<Integer>();
      ts.add(10);
      ts.add(40);
      ts.add(20);
      ts.add(50);
      ts.add(30);
      ts.add(10);
      Iterator<Integer> itr = ts.iterator();
      while(itr.hasNext()){
        Integer element = itr.next();
        System.out.println(element);
      }
    }
}



