class Test{
    public void m1(int x){
        System.out.println("Int version...");
    }
    public void m1(int... x){
        System.out.println("Var-arg version...");
    }
}
class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.m1();
    }
}