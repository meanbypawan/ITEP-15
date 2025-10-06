import java.util.TreeMap;
import java.util.Map;
class TestMain{
    public static void main(String args[]){
      TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
       tm.put(1001,"Cheeku");
       tm.put(1002,"Peeku");
       tm.put(1005,"Rinku");
       tm.put(1004,"Chinku");
       tm.put(1003,"Atul");
       tm.put(1003,"Ankita");
       //tm.put(null,"Rahul");
     
       for(Map.Entry<Integer,String> e : tm.entrySet()){
           System.out.println(e.getKey()+"  "+e.getValue());
       } 
    }
}