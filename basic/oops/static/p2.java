class A{
    static{
        System.out.println("Block-A");
        new C();
    }
}
class B{
    static{
        System.out.println("Block-B");
    }
}
class C{
    static{
        System.out.println("Block-C");
    }
}
class TestMain{
    public static void main(String... args){
        System.out.println("Main-started...");
        new A();
        new B();
        System.out.println("Main-end...");
    }

}