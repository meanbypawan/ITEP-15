import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
class TestMain{
    public static void main(String args[]){
       LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
       hm.put(1001,"Cheeku");
       hm.put(1002,"Peeku");
       hm.put(1005,"Rinku");
       hm.put(1004,"Chinku");
       hm.put(1003,"Atul");
       hm.put(1003,"Ankita");
       hm.put(null,"Rahul");
       Set<Map.Entry<Integer,String>> s = hm.entrySet();

       Iterator<Map.Entry<Integer,String>> itr =  s.iterator();
       
       while(itr.hasNext())
       {
        Map.Entry<Integer,String> e =  itr.next();
        System.out.println(e.getKey()+" "+e.getValue());
       }
    }
}