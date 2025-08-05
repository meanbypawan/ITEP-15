class Overloading{
    /*
    public void m1(int x, int y){
        System.out.println("Int Int Version...");
    }
    */
    public void m1(float x, float y){
        System.out.println("Float Float Version...");
    }
}

class TestMain{
    public static void main(String args[]){
        Overloading obj = new Overloading();
        obj.m1(20.5f,10.5f);
    }
}