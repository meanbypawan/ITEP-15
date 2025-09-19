class First implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
          try{  
            System.out.println("Thread T1...");
            Thread.sleep(2000);
          }
          catch(Exception e){
            e.printStackTrace();
          }  
        }
    }
}
class Second implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
          try{  
            System.out.println("Thread T2...");
            Thread.sleep(1700);
          }
          catch(Exception e){
            e.printStackTrace();
          }  
        }
    }
}
class TestMain{
    public static void main(String args[]){
        Runnable r1 = new First();
        Runnable r2 = new Second();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start(); // r1 ki run
        t2.start(); // r2 ki run

    }
}