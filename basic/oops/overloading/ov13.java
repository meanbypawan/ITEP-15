class Test{
    public Test(int x, float y){
        System.out.println("Integer-Integer Version...");
        this(x); // this-call
    }
    public Test(int x){
        this();
        System.out.println("Integer Version...");
    }
    public Test(){
        System.out.println("Default Version");
    }
}
class TestMain{
    public static void main(String args[]){
        new Test(20,10);
    }
}
