class First extends Thread{
    public void run(){
      for(int i=1; i<=5; i++){
         try{
          System.out.println("Thread T1....");
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
        for(int i=1; i<=5; i++){
           try{ 
            System.out.println("Thread T2....");
            Thread.sleep(1600);
           }
           catch(InterruptedException e){
            e.printStackTrace();
           }
        }
    }
}
class Third extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
           try{ 
            System.out.println("Thrad T3....");
            Thread.sleep(1400);
           }
           catch(InterruptedException e){
            e.printStackTrace();
           }
        }
    }
}
class TestMain{
    public static void main(String ars[]) throws InterruptedException{
       First t1 = new First();
       Second t2 = new Second();
       Third t3 = new Third();
       t1.start();
       t1.join(); // main stopped for 6000 ms
       t2.start();
       t2.join();
       t3.start();
    }
}
