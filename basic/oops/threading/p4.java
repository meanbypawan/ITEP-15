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
    public static void main(String ars[]){
       First t1 = new First(); // t1 is thread
       Second t2 = new Second();
       Third t3 = new Third();
       t1.setPriority(Thread.MIN_PRIORITY);
       t2.setPriority(Thread.MAX_PRIORITY);
       t3.setPriority(Thread.NORM_PRIORITY);
       System.out.println("T1 Priority : "+t1.getPriority());
       t1.start(); // run()
       t2.start();
       t3.start();
    }
}
