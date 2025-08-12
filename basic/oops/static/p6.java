class A{
    {
        System.out.println("Initializer Block...");
    }
    static{
        System.out.println("Static Block....");
    }
    public A(){
        System.out.println("Constructor....");
    }
}
class TestMain{
    public static void main(String args[]){
        new A();
    }
}
