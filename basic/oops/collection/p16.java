import java.util.LinkedHashSet;
class TestMain{
    public static void main(String args[]){
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
    }
}