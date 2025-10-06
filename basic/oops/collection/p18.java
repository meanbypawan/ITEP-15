import java.util.TreeSet;
import java.util.Iterator;
class TestMain{
    public static void main(String args[]){
      TreeSet<String> ts = new TreeSet<String>();
      ts.add("A");
      ts.add("D");
      ts.add("C");
      ts.add("D");
      ts.add("F");
      ts.add("A");
      Iterator<String> itr = ts.iterator();
      while(itr.hasNext()){
        String element = itr.next();
        System.out.println(element);
      }
    }
}



