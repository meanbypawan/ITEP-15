class TestMain{
    public static void main(String args[]){
        Runnable r1 = ()->{
         for(int i=1; i<=5; i++){
          try{  
            System.out.println("Thread T2...");
            Thread.sleep(1700);
          }
          catch(Exception e){
            e.printStackTrace();
          }  
         }
        };
        Runnable r2 = ()->{
         for(int i=1; i<=5; i++){
          try{  
            System.out.println("Thread T1...");
            Thread.sleep(1300);
          }
          catch(Exception e){
            e.printStackTrace();
          }  
         }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}