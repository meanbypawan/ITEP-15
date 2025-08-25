/*
    Overriding Method ---> child method
    Overridden Method ---> parent method
 */
class A{
    public void m1(){
        System.out.println("A-m1()");
    }
}
class B extends A{
   public void m1(){
      System.out.println("B-m1()");
   }
   public void m2(){
    System.out.println("B-m2()");
   }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B(); // upcasting
        
        B obj2 = (B)obj; // down-casting
        obj2.m1();
        obj2.m2();
    }
}





