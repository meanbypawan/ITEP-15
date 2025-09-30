import java.util.Collections;
import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(5);
        al.add(6);
        al.add(9);
        al.add(1);
        al.add(2);
        Collections.sort(al);
        for(Integer element : al)
          System.out.println(element);
    }
}