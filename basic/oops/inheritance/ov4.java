class A{
    public Object m1(){
        return 100;
    }
}
class B extends A{
    public String m1(){
        return "hello...";
    }
}

class TestMain{
    public static void main(String args[]){
        A obj = new B();
        System.out.println(obj.m1());
    }
}