class A{
   public A(){
    System.out.println("Default version...");
   } 
   public A(int x){
     System.out.println("Int-version...");
   }
   public A(int x, int y){
    System.out.println("Int-Int version...");
   }
}

class TestMain{
    public static void main(String args[]){
        A obj = new A();
        new A(100);
        new A(20,10);
    }
}