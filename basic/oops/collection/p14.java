import java.util.LinkedHashSet;
class TestMain{
    public static void main(String args[]){
       LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
       hs.add(10);
       hs.add(10);
       hs.add(9);
       hs.add(9);
       hs.add(100);
       hs.add(500);
       hs.add(350);
       System.out.println(hs);
    }
}