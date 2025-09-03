interface I1{
    void m1();
}
interface I2{
    void m1();
}

interface I3 extends I1,I2{} // I3 is functional

class TestMain{
    public static void main(String args[]){
        I3 obj = ()->System.out.println("Hello...");
        obj.m1();   
    }
}