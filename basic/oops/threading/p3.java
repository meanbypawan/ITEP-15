class First extends Thread{
    public void run(){
      for(int i=1; i<=10; i++){
         try{
          System.out.println(Thread.currentThread().getName());  
          Thread.sleep(2000);
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
       First t2 = new First();
       t1.setName("Thread-T1 ");
       t2.setName("Thread-T2 ");
       t1.start(); // run()
       t2.start();
    }
}
