import java.util.Vector;
/*
  Vector()
  Vector(Collection)
  Vector(int)
  Vector(int,int)
 */
class TestMain{
   public static void main(String args[]){
     Vector v = new Vector(3,2);
     v.add(10);
     v.add(10);
     v.add(10);
     System.out.println("Capacity : "+v.capacity());
     v.add(10);
     System.out.println("Capacity : "+v.capacity());
     
   }
}