import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
       ArrayList<Integer> al = new ArrayList<Integer>(3); // 10
       al.add(10);
       al.add(50);
       al.add(20);
       al.add(30);
       al.add(40);
       System.out.println(al);
       System.out.println("Total Element : "+al.size());
       System.out.println(al.contains(500));
       
       
    }
}