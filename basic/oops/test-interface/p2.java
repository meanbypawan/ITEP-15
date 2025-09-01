interface I1{
    void m1();
    default void wish(){ // Defulat means , it is default implementation
        System.out.println("GM...");
    }
    static int operation(int a, int b){
        return a+b;
    }
}
class Test implements I1{
    public void m1(){
        System.out.println("M1-executed...");
    }
    // public void wish(){
    //     System.out.println("GN...");
    // }
}
class TestMain{
    public static void main(String args[]){
        I1 obj = new Test();
        obj.m1();
        obj.wish();
        int result =  I1.operation(20,10);
        System.out.println("Addition : "+result);
    }
}
