class Overloading{
    public void m1(char x){
        System.out.println("Char version...");
    }
    /*
    public void m1(int x){
        System.out.println("Int version...");
    }
    */
}
class TestMain{
    public static void main(String args[]){
      Overloading obj = new Overloading();
      obj.m1(65);
    }
}




