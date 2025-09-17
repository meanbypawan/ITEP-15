class First extends Thread{
    public void run(){
      for(int i=1; i<=10; i++){
          System.out.println("Cheeku....");
      }
    }
}
class Second extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Peeku....");
        }
    }
}
class TestMain{
    public static void main(String ars[]){
       First t1 = new First(); // t1 is thread
       Second t2 = new Second();
       t1.start(); // run()
       t2.start();
    }
}
