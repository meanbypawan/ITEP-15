class Overloading{
    public void m1(int x, long y){
        System.out.println("Int-Long Version...");
    }
    public void m1(long x, int y){
        System.out.println("Long-Int Version");
    }
    public void m1(int x, int y){
        System.out.println("Int Int version..");
    }
}
class TestMain{
    public static void main(String args[]){
        Overloading obj = new Overloading();
        obj.m1(20,10L);
    }
}