class A{
    public static void m1(){
        System.out.println("A-m1()...");
    }
}
class B extends A{
    public static void m1(){
        System.out.println("B-m1()....");
    }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.m1();
    }
}