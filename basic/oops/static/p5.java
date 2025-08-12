class A{
    static{
        System.out.println("Block-A");
    }
    public static void m1(){
        System.out.println("A-m1()");
    }
}
class B{
    static{
        System.out.println("Block-B");
    }
}
class TestMain{
    static{
        System.out.println("Main-Block");
    }
    public static void main(String arg[]){
        new B();
        A.m1();        
    }
}