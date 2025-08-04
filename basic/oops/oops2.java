/*
  Method :-
   1. Instance Method  :-- Belongs To Object [Behaviour of Object]
   2. Static Method   :----Belongs To Class [Behaviour of class]
 */
class Test{
   public void m1(){
      System.out.println("Hello m1()");
   }
   public void add(float a, float b){ // Formal Argument...
     System.out.println("Result : "+(a+b));
   }
   public float multiplication(float a, float b){
     return a * b;
   }
}

class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.m1();
        obj.add(2.5f,10);
        float result = obj.multiplication(5,2.5f);
        System.out.println("Multiplication : "+result);
    }
}