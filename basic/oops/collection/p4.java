import java.util.ArrayList;

/*
   IndexOutOfBoundsException
     |--ArrayIndexOutOfBoundsException
     |--StringIndexOutOfBoundsException
     
   public void add(int index, Integer element){
      if(index > this.size())
        throw new IndexOutOfBoundsException();
      else{
        // add element
      }   
   }
 */
class TestMain{
    public static void main(String args[]){
       ArrayList<Integer> al = new ArrayList<Integer>();
       al.add(10);
       al.add(20);
       al.add(30);
       al.add(40);
       al.add(50);
       System.out.println("Size : "+al.size());
       System.out.println(al);
       al.add(2,300);
       System.out.println(al);
       al.add(9,5000);
       System.out.println(al);
    }
}