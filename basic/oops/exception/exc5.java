/*
  1. try{}
     catch(AE e)
  -----------------
  2. try{}
     catch(AE e){}
     catch(Ex e){}
  -------------------
  3. try{}
     catch(AE | IME e){}
     catch(Ex e){}
  --------------------------
  4. try{}
     catch(Ex e){}
     catch(AE e){}  -----> Invalid
  ---------------------------------
  5. try{}
     catch(Ex e){}
     finally{}
  -------------------
  6. try{}
     catch(AE e){}
     catch(Ex e){}
     finally{}
  ------------------------
  7. try{}
     finally{}  
     S.o.p("Hello..");
  -----------------------------
  8. try{
       try{}
       catch(){}
       finally{}
     }          
     catch(Ex e){
       try{}
       catch(){}
     }          
     finally{
       try{}
       catch(){}
       finally{}
     }
 */

class TestMain{
    public int m1(){
       try{
          /*
            ---
            ---
           */
          //int c = 10/0;
       }
       catch(Exception e){
       }
       finally{
         System.out.println("Finally Executed..."); 
       }
       return 400;
    }
    public static void main(String args[]){
       TestMain obj = new TestMain();
       int result = obj.m1();
       System.out.println("Result : "+result);
    }
}











