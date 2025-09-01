class AA{
    static{
        System.out.println("Block-AA");
    }
}
class A extends AA{
    { // initializer block
       System.out.println("A-Initializer Block");
    }
    public A(){
        System.out.println("A-Default Constructor");
    }
    static{
        System.out.println("Block-A");
    }
}
class B extends A{
    { // initializer block
       System.out.println("B-Initializer Block");
    }
    public B(){
        System.out.println("B-Default Constructor");
    }
    static{
        System.out.println("Block-B");
    }
}
class TestMain{
    public static void main(String args[]){
        new B();
    }
}