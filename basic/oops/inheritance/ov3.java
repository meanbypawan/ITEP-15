class A{
    public A m1(){
        System.out.println("A-m1()");
        A obj = new A();
        return obj;
    }
}
class B extends A{
    public B m1(){
        System.out.println("B-m1()");
        B obj = new B();
        return obj;
    }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.m1();
    }
}