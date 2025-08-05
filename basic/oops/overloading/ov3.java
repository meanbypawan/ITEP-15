class Overloading{
    public void m1(byte x){
        System.out.println("Byte version...");
    }
    public void m1(short x){
        System.out.println("Short version...");
    }
}
class TestMain{
    public static void main(String args[]){
       Overloading obj = new Overloading();
       byte a = 1;
       obj.m1(a);
    }
}