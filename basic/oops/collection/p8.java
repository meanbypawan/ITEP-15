import java.util.ArrayList;
import java.util.Iterator;
class TestMain{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(30);
        al.add(40);
        Iterator<Integer> itr =  al.iterator(); // fail-fast
        while(itr.hasNext()){
            Integer element = itr.next();
            if(element == 30)
              itr.remove();
            System.out.println(element);
        }
        System.out.println(al);
    }
}