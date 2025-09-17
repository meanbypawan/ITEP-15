class First extends Thread{
    public void run(){
      for(int i=1; i<=10; i++){
         try{
          System.out.println("Cheeku....");
          Thread.sleep(2000);
         }
         catch(InterruptedException e){
            e.printStackTrace();
         } 
      }
    }
}
class Second extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
           try{ 
            System.out.println("Peeku....");
            Thread.sleep(1600);
           }
           catch(InterruptedException e){
            e.printStackTrace();
           }
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
