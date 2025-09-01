interface I1{
    default int calculate(int x){
       return x*x;
    }
}
interface I2{
    default int calculate(int x){
        return x*x*x;
    }    
}

class Test implements I1,I2{
   public int calculate(int x){
    System.out.println("Child Version....");
    return x*x;
   }
}
class TestMain{
    public static void main(String args[]){
       I1 obj = new Test();
       int result = obj.calculate(2);
       System.out.println("Result : "+result);
    }
}