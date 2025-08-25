class A{
    public void eval(int a, int b){
        System.out.println("Addition : "+(a+b));
    }
}
class B extends A{
    public void eval(int a, int b){
        System.out.println("Multiplication : "+(a*b));
    }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.eval(20,10);
    }
}