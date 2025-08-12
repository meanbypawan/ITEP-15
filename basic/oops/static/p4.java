class A{
    private int a;
    private static int b;
    public A(int a){
        this.a = a;
        System.out.println("Constructor Executed...");
    }
    {
        System.out.println("Initializer Block....");
    }
    static{
        b = 100;
        System.out.println("Static Block Executed....");
    }
    public void display(){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
class TestMain{
    
    public static void main(String args[]){
        A obj = new A(50);
        obj.display();
    }
}