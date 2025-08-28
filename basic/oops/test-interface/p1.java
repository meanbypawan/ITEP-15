interface I{
    void m1(); // public + abstract
    void m2();
}

class Test implements I{
   public void m1(){
    System.out.println("m1-called..");
   }
   public void wish(){
    System.out.println("GM....");
   }
}

class TestMain{
    public static void main(String args[]){
      // Test obj = new Test();
      I obj = new Test();
      obj.m1();
      //obj.wish();
    }
}