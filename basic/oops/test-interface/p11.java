// In Java, can we create static class
class A{
   static class B{  
      static public void wish(){
        System.out.println("GM....");
      }
   }
}
class TestMain{
  public static void main(String args[]){
    // A.B ref =  new A.B();
    // ref.wish();
    A.B.wish();
  } 
}