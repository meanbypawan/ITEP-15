import java.util.*;
class TestMain extends Thread{
    private static ArrayList<Integer> al = new ArrayList<Integer>();
    public void run(){
        try{
           System.out.println("T1 is accessing array-list");
           Thread.sleep(1000);
           al.add(50);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]) throws InterruptedException{
       al.add(10);
       al.add(20);
       al.add(30);
       Iterator<Integer> itr = al.iterator();
       Thread t = new TestMain();
       t.start(); 
      
       while(itr.hasNext()){
          Thread.sleep(5000);
          Integer element = itr.next();
          System.out.println(element);
       }
    }
}