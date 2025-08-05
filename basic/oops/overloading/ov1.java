class Overloading{
    public void m1(){
        System.out.println("Default version...");
    }
    public void m1(int x){
        System.out.println("Int version...");
    }
    public void m1(float x){
        System.out.println("Float version....");
    }
    public void m1(int x, int y){
        System.out.println("Int-Int version...");
    }
}

class TestMain{
    public static void main(String args[]){
        Overloading obj = new Overloading();
        obj.m1();
        obj.m1(100); // HMP :- 1, TOP :- int
        obj.m1(20,10);
    }
}