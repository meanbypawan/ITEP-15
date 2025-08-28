abstract class Parent{
    public void m1(){
        System.out.println("Parent - m1()");
    }
    abstract public void m2();
}
class Child extends Parent{
    public void m2(){
        System.out.println("Child-m2()");
    }
}
class TestMain{
    public static void main(String args[]){
        Parent p = new Child();
        p.m1();
        p.m2();
    }
}