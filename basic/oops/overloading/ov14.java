class Test{
    public Test(int x, int y){
        this(x);
        System.out.println("Integer-Integer Version...");
    }
    public Test(int x){
        this(20,10);
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
