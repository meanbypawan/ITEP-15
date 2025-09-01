interface I1{
    int calculate(int x);
}
interface I2{
    int calculate(int x);    
}

class Test implements I1,I2{
   public int calculate(int x){
    return x*x;
   }
}
class TestMain{
    public static void main(String args[]){
       Test obj = new Test();
       int result = obj.calculate(2);
       System.out.println("Result : "+result);
    }
}