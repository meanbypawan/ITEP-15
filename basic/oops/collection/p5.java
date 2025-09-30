import java.util.ArrayList;

/*
   public E remove(int);
   public boolean remove(java.lang.Object);

*/
class TestMain{
    public static void main(String args[]){
       ArrayList<Integer> al = new ArrayList<Integer>();
       al.add(1);
       al.add(4);
       al.add(6);
       al.add(3);
       al.add(7);
       al.add(2);
       al.add(2);
       al.add(2);
       al.add(200);
       System.out.println(al);
       al.remove(new Integer(2));
       System.out.println(al);
    }
}